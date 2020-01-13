package br.com.fiap.consumidorone.components;

import br.com.fiap.consumidorone.domain.BolsaFamiliaModel;
import br.com.fiap.consumidorone.services.ConsumerService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Autowired
    private ConsumerService service;

    @KafkaListener(topics = "${consumerone.topic}", groupId = "br.com.fiap")
    public void consume(final BolsaFamiliaModel consumerRecord) throws IOException {
        try {
            service.consume(consumerRecord);
        } catch (Exception e) {
            System.out.println("DEU ERRO: " + consumerRecord );
        }
    }
}