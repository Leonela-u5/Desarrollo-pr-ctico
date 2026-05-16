package com.leonela.universities_service.config;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = RabbitConfig.QUEUE)
    public void recibir(String mensaje) {

        System.out.println(
                "Mensaje recibido: " + mensaje
        );
    }
}