package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringcloudstreamappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudstreamappApplication.class, args);
    }

	@Bean
    public Supplier<UUID> stringSupplier() {
        return () -> {
            return UUID.randomUUID();
        };
    }
    //consumer-reading message from the kafka topic
    @Bean
    public Consumer<String> stringConsumer(){
        return result->{
            System.out.println("String Consumer => "+ result);
        };
    }
    @KafkaListener(id="randomUUid-topic",topics = "randomUUid-topic")
    public void listen(String result){
        System.out.println("listen "+ result);

    }



}
