package br.com.fiap.consumidorone.components;

import br.com.fiap.consumidorone.domain.BolsaFamiliaModel;
import br.com.fiap.consumidorone.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer implements Consumer{

    @Autowired
    private ConsumerService service;

    @KafkaListener(topics = "${consumerone.topic}", groupId = "${consumerone.group-id}")
    public void consume(final BolsaFamiliaModel consumerRecord) {
            service.consume(consumerRecord);
    }
}