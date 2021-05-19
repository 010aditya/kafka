package com.kafka.assignment.turnstile.resource;

import com.kafka.assignment.turnstile.model.TurnstileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurnstilesController {
    @Autowired
    private KafkaTemplate<String, TurnstileModel> kafkaTemplate;

    private static final String TOPIC = "turnstile";

    @PostMapping(path = "kafka/postTurnstile")
    public String post(@RequestBody TurnstileModel turnstileModel) {
        kafkaTemplate.send(TOPIC, turnstileModel);

        return "Published Successfully";
    }
}
