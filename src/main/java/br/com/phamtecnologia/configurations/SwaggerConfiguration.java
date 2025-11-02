package br.com.phamtecnologia.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI custoOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("User API")
                        .description("User API documentation with Spring Boot and Swagger")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Pedro Maranhão")
                                .email("pedro.maranhao@yahoo.com.br")
                                .url("phamtecnologia.com.br")));
    }
}
