package com.muhammet.sales.config.kafka;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Null;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@ToString(of = {"id","message","messageDate"})
public class KafkaMessage {
    private String message;
    @Null
    private String id = UUID.randomUUID().toString();
    @Null
    private LocalDate mesageDate = LocalDate.now();
}
