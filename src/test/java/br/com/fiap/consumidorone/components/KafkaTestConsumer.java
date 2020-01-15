package br.com.fiap.consumidorone.components;

import br.com.fiap.consumidorone.domain.BolsaFamiliaModel;
import br.com.fiap.consumidorone.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

@Component
@ActiveProfiles(value = "test")
public class KafkaTestConsumer implements Consumer{

    public void consume(final BolsaFamiliaModel consumerRecord){
    }
}