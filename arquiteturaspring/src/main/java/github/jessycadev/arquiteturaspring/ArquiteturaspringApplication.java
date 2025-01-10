package github.jessycadev.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaspringApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);

		//desativar o banner do springboot
		builder.bannerMode(Banner.Mode.OFF);

		//ativar o perfil de producao subir a aplicacao em modo de producao banco de producao nao é o ideal mas pode para debug
		builder.profiles("producao","homologacao");

		//roda o projeto
		builder.run(args);

		//contexto é possivel pegar variaveis de configuracao do contexto
		ConfigurableApplicationContext applicationContext = builder.context();

		//var repositoryProduto = applicationContext.getBean("produtoRepository");

		ConfigurableEnvironment environment = applicationContext.getEnvironment();

		// variaveis do application properties
		String applicationName = environment.getProperty("spring.application.name");
		System.out.println("nome da aplicação:" +applicationName);


	}

}
