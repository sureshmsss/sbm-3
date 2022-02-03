package ss.it.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerAPITest {
	
	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("ss.it.controller")).paths(PathSelectors.regex("/pc.*")).build().useDefaultResponseMessages(true).apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		Contact contact=new Contact("suresh", "hcs/pc", "ss@gmail.com");
		return new ApiInfo("PCApi","gives details about pcs","3.4 release","hcs.com",contact,"GNUPUblic","https://slcicence",Collections.emptyList());
	}
	
	



}
