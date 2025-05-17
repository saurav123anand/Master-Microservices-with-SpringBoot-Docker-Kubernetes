package com.microservices.accounts;

import com.microservices.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title ="Accounts Microservice API Documentation",
				description = "PhoenixBank Accounts microservice REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Saurav J.",
						email = "test@phoenix.com",
						url = "https://www.phoenixBank.com"),
				license=@License(
						name = "Apache 2.0",
						url = "https://phoenixBank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "PhoenixBank Accounts Microservice Rest API Documentation",
				url = "https://phoenixBank.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
