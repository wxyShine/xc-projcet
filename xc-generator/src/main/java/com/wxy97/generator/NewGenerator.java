package com.wxy97.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author wxy
 * @description 全新代码生成器
 * @date 2023/03/01 下午2:37
 * @email wxyrrcj@gmail.com
 */
public class NewGenerator {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://47.95.200.155:3306/xc_system?serverTimezone=UTC&userUnicode=true&useSSL=false",
                "root", "smx13imu")
            .globalConfig(builder -> {
                builder.author("wxy") // 设置作者
                    .enableSwagger() // 开启 swagger 模式
                    .disableOpenDir()
                    .outputDir(System.getProperty("user.dir") + "/xc-generator/src/main/java");
            })
            .packageConfig(builder -> {
                builder.parent("com.wxy97") // 设置父包名
                    .moduleName("system") // 设置父包模块名
                    .entity("model.po")
                    .service("service")
                    .serviceImpl("service.impl")
                    .xml("mapper");
            })
            .strategyConfig(builder -> {
                builder.addInclude("dictionary")
                    .mapperBuilder()
                    .enableBaseResultMap()
                    .enableBaseColumnList()
                    .entityBuilder()
                    .enableRemoveIsPrefix()
                    .enableLombok()
                    .addTableFills(Arrays.asList(
                        new Column("create_date", FieldFill.INSERT),
                        new Column("change_date", FieldFill.INSERT_UPDATE),
                        new Column("modify_date", FieldFill.UPDATE)))
                    .controllerBuilder()
                    .enableHyphenStyle()
                    .enableRestStyle();


            })
            .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
            .execute();
    }
}
