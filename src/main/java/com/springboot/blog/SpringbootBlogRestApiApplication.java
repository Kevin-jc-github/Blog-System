package com.springboot.blog;

<<<<<<< HEAD
import org.modelmapper.ModelMapper;
=======
import com.springboot.blog.entity.Role;
import com.springboot.blog.repository.RoleRepository;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
<<<<<<< HEAD
public class SpringbootBlogRestApiApplication {
=======
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot BLog App REST APIs",
				description = "Spring Boot Blog App REST APIs Documentation",
				version = "V1.0",
				contact = @Contact(
						name = "Kevin Zhu",
						email = "jiancoz@uci.edu",
						url = "https://www.jiancongzhu.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.jiancongzhu.com/license"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Blog App Documentation",
				url = "https://github.com/Kevin-jc-github/SpringBootBlogger"
		)
)
public class SpringbootBlogRestApiApplication implements CommandLineRunner {
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}

<<<<<<< HEAD
=======
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {
		Role adminRole = new Role();
		adminRole.setName("ROLE_ADMIN");
		roleRepository.save(adminRole);

		Role userRole = new Role();
		userRole.setName("ROLE_USER");
		roleRepository.save(userRole);

	}
>>>>>>> 57fc075 (Add Springboot Swagger-UI and place this project to AWS CLOUD)
}
