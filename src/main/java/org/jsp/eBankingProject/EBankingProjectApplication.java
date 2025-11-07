package org.jsp.eBankingProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EBankingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBankingProjectApplication.class, args);
	}

}
