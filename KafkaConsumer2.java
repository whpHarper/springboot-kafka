package com.databps.bigdaf.admin.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer2 {
    @KafkaListener(topics = {"test"})
    public void processMessage(String content) {
        System.out.println("消息被消费"+content);
    }
}
