package com.muhammet.sales.config.swagger;



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

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.muhammet.sales"))
                .paths(PathSelectors.regex("/.*"))
                .build()
                .apiInfo(apiEndPointInfo());
    }

    private ApiInfo apiEndPointInfo(){
        return new ApiInfoBuilder().title("Spring Boot Swagger Examaple")
                .description("Muhammet Ali KAYA Dokümanyasyonu")
                .contact(new Contact("Muhammet Ali KAYA","",""))
                .license("Apache 2.0")
                .licenseUrl("")
                .version("V.1.0.5")
                .termsOfServiceUrl("")
                .build();
    }
}
