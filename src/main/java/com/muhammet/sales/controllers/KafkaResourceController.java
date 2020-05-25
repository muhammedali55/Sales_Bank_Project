package com.muhammet.sales.controllers;

import com.muhammet.sales.config.kafka.KafkaMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/kafkamessage")
@RequiredArgsConstructor
@Api
public class KafkaResourceController {

    @Value("${com.education.kafka.topic}")
    private String topic;

    private final KafkaTemplate<String, KafkaMessage> messageKafkaTemplate;
    @ApiOperation(value = "kafka mesahj apisi")
    @PostMapping
    public void sendMessage(@RequestBody KafkaMessage kafkaMessage){
        messageKafkaTemplate.send(topic, UUID.randomUUID().toString(),kafkaMessage);
    }
}
