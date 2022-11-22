package com.syj.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author syj
 * @version V1.0.0
 * @contact shiyunjie45@163.com
 * <ul>
 * @description swaggeer配置
 * </ul>
 * @className Swagger2Config
 * @createdTime 2022/11/22 14:08
 */
@Configuration
public class Swagger2Config {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(Swagger2Config.class.getPackage().getName().replace(".config",".controller")))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("mysql示例项目")
                .description("mysql示例接口")
                .contact(new Contact("syj", "https://blog.csdn.net/jiejie11080", "shiyunjie45@163.com"))
                .version("1.0")
                .build();
    }
}
