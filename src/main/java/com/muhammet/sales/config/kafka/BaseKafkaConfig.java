package com.muhammet.sales.config.kafka;

import static org.apache.kafka.clients.CommonClientConfigs.REQUEST_TIMEOUT_MS_CONFIG;
import static org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseKafkaConfig {

  @Value("${kafka.bootstrap.servers}")
  String bootstrapServers;

  @Value("${kafka.request.timeout.ms}")
  String requestTimeout;


  public Map<String, Object> defaultConfig() {
    final Map<String, Object> defaultConfigMap = new HashMap<>();

    defaultConfigMap.put(BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    defaultConfigMap.put(REQUEST_TIMEOUT_MS_CONFIG, requestTimeout);

    return defaultConfigMap;
  }


}
