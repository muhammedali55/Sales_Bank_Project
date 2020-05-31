package com.muhammet.sales.controllers;

import static com.muhammet.sales.constants.RestApiUrls.CUSTOMERS;
import static com.muhammet.sales.constants.RestApiUrls.CUSTOMER_MANAGER_API_VERSION;
import static com.muhammet.sales.constants.RestApiUrls.KAFKA;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CUSTOMER_MANAGER_API_VERSION + CUSTOMERS)
@RequiredArgsConstructor
@Slf4j
@Api(value = "Customer Manager Rest APIs")
public class KafkaResourceController {

  private final KafkaTemplate<String, String> messageKafkaTemplate;
  @Value("${kafka.com.education.topic}")
  private String topic;

  @ApiOperation(value = "send message for publish kafka", nickname = "sendMessage", response = ResponseEntity.class)
  @PostMapping(KAFKA)
  public void sendMessage(@RequestBody String message) {
    messageKafkaTemplate.send(topic, UUID.randomUUID().toString(), message);
  }
}
