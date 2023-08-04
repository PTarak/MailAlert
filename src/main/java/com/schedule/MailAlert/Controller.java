package com.schedule.MailAlert;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.schedule")
public class Controller {
    @Autowired
    ProducerTemplate producerTemplate;
    @GetMapping("/home")
    public String home() {
        producerTemplate.sendBody("direct:someservice", "text");
        return "This is the sample data";
    }
}
