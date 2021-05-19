package com.kafka.assignment.arrivals.resource;

import com.kafka.assignment.arrivals.model.ArrivalsModel;
import com.kafka.assignment.arrivals.model.TurnstileModel;
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
    @PostMapping(path = "kafka/postArrival")
    public String post(@RequestBody TurnstileModel turnstileModel){
        kafkaTemplate.send(TOPIC,turnstileModel);

        return "Published Successfully";
    }
}
