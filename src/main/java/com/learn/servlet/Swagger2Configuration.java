package com.learn.servlet;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.forezp.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("springboot利用swagger构建api文档")
//                .description("简单优雅的restfun风格，http://blog.csdn.net/forezp")
//                .termsOfServiceUrl("http://blog.csdn.net/forezp")
//                .version("1.0")
//                .build();
//    }

}
