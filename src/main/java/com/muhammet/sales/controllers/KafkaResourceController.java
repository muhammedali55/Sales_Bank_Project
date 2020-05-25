package com.muhammet.sales.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkamessage")
@RequiredArgsConstructor
@Api
public class KafkaResourceController {

  private final KafkaTemplate<String, String> messageKafkaTemplate;
  @Value("${kafka.com.education.topic}")
  private String topic;

  @ApiOperation(value = "kafka mesahj apisi")
  @PostMapping
  public void sendMessage(@RequestBody String message) {
    messageKafkaTemplate.send(topic, UUID.randomUUID().toString(), message);
  }
}
