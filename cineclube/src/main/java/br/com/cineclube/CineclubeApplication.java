package br.com.cineclube;

import org.springframework.boot.SpringApplication;

/**
 * Roteiro:
 * Repository (Camada de persistencia)-> JPA + H2
 * 	Fazer caso de uso manter Filme
 * View -> templates html com bootstrap.
 * Controller Filme > com as rotas para manteFilme
 * 
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CineclubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CineclubeApplication.class, args);
	}

}
