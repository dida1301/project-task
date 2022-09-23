package group.work.store.management;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@OpenAPIDefinition
public class StoreManagementApplication {
	public static void main(String [] args)
	  {
		  ConfigurableApplicationContext run = SpringApplication.run(StoreManagementApplication.class, args);
	  }
	}


