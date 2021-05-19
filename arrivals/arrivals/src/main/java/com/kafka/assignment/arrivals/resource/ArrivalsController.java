package com.kafka.assignment.arrivals.resource;

import com.kafka.assignment.arrivals.model.ArrivalsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArrivalsController {

    @Autowired
    private KafkaTemplate<String, ArrivalsModel> kafkaTemplate;

private static final String TOPIC = "arrivals";
    @PostMapping(path = "kafka/postArrival")
    public String post(@RequestBody ArrivalsModel arrivalsModel){
        kafkaTemplate.send(TOPIC,arrivalsModel);

        return "Published Successfully";
    }
}
