package br.com.siteware.sitewareProduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SitewareProdutoApplication {
@GetMapping
	public String getHomeTeste(){
		return "SiteWare Produto API Home!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SitewareProdutoApplication.class, args);
	}

}
