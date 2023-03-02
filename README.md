# xc-projcet  
## 说明
《学成在线》微服务项目，基于`SpringCloud`、`SpringCloudAlibaba`技术栈开发
[b站视频](https://www.bilibili.com/video/BV1j8411N7Bm?p=1&vd_source=ee0b580c4832a99b7bb62950542b4889)

* main分支为已测试功能
* [dev](https://github.com/wxyShine/xc-projcet/tree/dev)  

## 采用最新版本
`JDK17`,`SpringBoot3.0`,`SpringCloud2022.0.1`, `springCloudAlibaba2.2.10-RC1`




## 新版本注意事项
#### 1.bootstrap.yml配置不生效
> 在启动程序时加入 -Dspring.cloud.bootstrap.enabled=true  否则bootstrap.yml 不会生效  [参考](https://www.jianshu.com/p/f6ec19fb5596)

#### 2. MP新版本代码生成器
> https://github.com/baomidou/generator

#### 3.新版本跨域解决
> 用原来配置会出错误
```
java.lang.IllegalArgumentException: When allowCredentials is true, allowedOrigins cannot contain the special value "*" since that cannot be set on the "Access-Control-Allow-Origin" response header. To allow credentials to a set of origins, list them explicitly or consider using "allowedOriginPatterns" instead.
```
> 这个错误消息是因为在设置 allowCredentials 为 true 时，不能使用 "*" 作为 allowedOrigins 的值。原因是当服务器返回 Access-Control-Allow-Origin: * 头信息时，表示允许来自任何来源的跨域请求，但是带有身份验证信息（如 cookies、Authorization headers）的请求将被浏览器拒绝。

> 为了允许指定的来源具有身份验证信息，您需要显式地列出它们，或者考虑使用 allowedOriginPatterns（Spring Boot 2.4+）代替 allowedOrigins

以下是在 Spring Boot 2.4+ 中正确配置跨域请求的完整示例代码：
```Java
@Configuration
public class CorsConfig {

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
          .allowedOriginPatterns("*")
          .allowedMethods("GET", "POST", "PUT", "DELETE")
          .allowedHeaders("*")
          .allowCredentials(true)
          .maxAge(3600);
      }
    };
  }

  @Bean
  public CorsFilter corsFilter() {
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    config.addAllowedOriginPattern("*");
    config.addAllowedHeader("*");
    config.addAllowedMethod("OPTIONS");
    config.addAllowedMethod("HEAD");
    config.addAllowedMethod("GET");
    config.addAllowedMethod("PUT");
    config.addAllowedMethod("POST");
    config.addAllowedMethod("DELETE");
    config.addAllowedMethod("PATCH");
    source.registerCorsConfiguration("/**", config);
    return new CorsFilter(source);
  }
}
这里通过 @Bean 注解注册了两个 Bean，一个是实现 WebMvcConfigurer 接口的 corsConfigurer，用于设置 WebMvc 的 CORS 配置，另一个是 CorsFilter，用于添加到过滤器链中以支持 Spring Security。

在 CorsConfiguration 中使用了 addAllowedOriginPattern("*") 代替了 addAllowedOrigin("*")，并且将 allowCredentials 设置为 true，以允许带有身份验证信息的请求。

需要注意的是，为安全起见，不应该允许来自任何来源的请求。在生产环境中，请根据您的应用程序需求配置适当的跨域策略。

```
