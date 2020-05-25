package com.muhammet.sales.service.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DefaultEventListener {


    @KafkaListener(
        topics = "${kafka.com.education.topic}",
        groupId = "${kafka.com.education.consumer.groupId}"
    )
    public void listen(String message) {
        System.out
            .printf("Listening Message... Message ID..: {},  Message Body...: {},  Date...: {}"
                //,
                //  message.getId(),
                //  message.getMessage(),
                //  message.getMessageDate()
            );
    }
}
