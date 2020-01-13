package br.com.fiap.consumidorone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication(exclude = KafkaAutoConfiguration.class)
public class ConsumidorOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumidorOneApplication.class, args);
	}

}
