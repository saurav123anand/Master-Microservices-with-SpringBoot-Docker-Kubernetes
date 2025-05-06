
package com.microservices.cards;

import com.microservices.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "PhoenixBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Saurav",
						email = "tutor@eazybytes.com",
						url = "https://www.PhoenixBank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.PhoenixBank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "PhoenixBank Cards microservice REST API Documentation",
				url = "https://www.PhoenixBank.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}