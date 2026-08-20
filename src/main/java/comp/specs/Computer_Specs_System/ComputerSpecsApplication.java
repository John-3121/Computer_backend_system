package comp.specs.Computer_Specs_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
    DataSourceAutoConfiguration.class,
    HibernateJpaAutoConfiguration.class
}) 
public class ComputerSpecsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputerSpecsApplication.class, args);
	}

}
