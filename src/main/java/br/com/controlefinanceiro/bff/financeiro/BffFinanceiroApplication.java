package br.com.controlefinanceiro.bff.financeiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BffFinanceiroApplication {

	public static void main(String[] args) {

		SpringApplication.run(BffFinanceiroApplication.class, args);
	}

}
