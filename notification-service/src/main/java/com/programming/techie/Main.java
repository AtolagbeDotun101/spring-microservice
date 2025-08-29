package com.programming.techie;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.programming.techie.event.OrderPlacedEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j()
@SpringBootApplication()
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(OrderPlacedEvent event){
        log.info("Recieved notification from Order service {}", event.getOrderNumber());
    }
}   