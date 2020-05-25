package com.muhammet.sales.service;

import com.muhammet.sales.config.kafka.KafkaMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaListenerService {


    @KafkaListener(
            topics = "${com.education.kafka.topic}",
            groupId = "${com.education.kafka.group.id}"
    )
    public void listen(KafkaMessage message){
            System.out.printf("Listening Message... Message ID..: {},  Message Body...: {},  Date...: {}"
              //,
              //  message.getId(),
              //  message.getMessage(),
              //  message.getMessageDate()
        );
    }
}
