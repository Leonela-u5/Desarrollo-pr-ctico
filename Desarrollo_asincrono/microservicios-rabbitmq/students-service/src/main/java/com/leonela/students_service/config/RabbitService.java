package com.leonela.students_service.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;


@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class RabbitService{

private final RabbitTemplate rabbitTemplate;

public void enviar(String mensaje) {
rabbitTemplate.convertAndSend(RabbitConfig.QUEUE, mensaje);
}
}
