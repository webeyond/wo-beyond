package com.unicom.wobeyond.config;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     * 设置监控路径,默认监控com.example
     *
     * @return
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .produces(Sets.newHashSet("application/json"))
                .consumes(Sets.newHashSet("application/json"))
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.unicom.wobeyond"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * ApiInfo
     *
     * @return
     */
    private ApiInfo apiInfo() {

        Contact contact = new Contact(
                "author",
                "https://blog.csdn.net/zhuimeng_by",
                "beyond_champion@163.com");

        return new ApiInfoBuilder()
                .title("wo-beyond")
                .description("沃超越后端接口标准化api文档")
                .version("1.0.0")
                .license("项目GitHub地址")
                .licenseUrl("https://github.com/webeyond/wo-beyond")
                .contact(contact)
                .build();
    }
}

