# xc-projcet  
## 说明
《学成在线》微服务项目，基于`SpringCloud`、`SpringCloudAlibaba`技术栈开发
[b站视频](https://www.bilibili.com/video/BV1j8411N7Bm?p=1&vd_source=ee0b580c4832a99b7bb62950542b4889)
 
## 采用最新版本
`JDK17`,`SpringBoot3.0`,`SpringCloud2022.0.1`, `springCloudAlibaba2.2.10-RC1`




## 新版本探坑
#### 1.bootstrap.yml配置不生效
> 在启动程序时加入 -Dspring.cloud.bootstrap.enabled=true  否则bootstrap.yml 不会生效  [参考](https://www.jianshu.com/p/f6ec19fb5596)
#### 2. MP新版本代码生成器
> https://github.com/baomidou/generator