package com.schedule.scheduler;

import org.apache.camel.CamelContext;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.support.DefaultExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableScheduling
public class FirstScheduler {

    CamelContext ctx = new DefaultCamelContext();

    private final ProducerTemplate producerTemplate = ctx.createProducerTemplate();

    private int count =0;
    @Scheduled(fixedRate = 5000)
    private void runningSchedulerJob() {
        System.out.println("Scheduler job");
//        producerTemplate.sendBody("direct:someservice", count++);
    }
}
