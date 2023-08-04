package com.schedule.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CommonRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:scheduler?period=5000")  // Trigger every 5 seconds
                .log("Scheduled task executed at ${header.firedTime}");

        from("direct:someservice").log("Executed some service with ${body}");
    }
}
