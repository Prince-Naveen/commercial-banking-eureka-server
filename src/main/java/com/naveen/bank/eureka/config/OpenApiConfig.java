package com.naveen.bank.eureka.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("Commercial Banking Eureka Server")
                        .version("1.0")
                        .description("Service Registry"))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("Project Documentation"));

    }

}