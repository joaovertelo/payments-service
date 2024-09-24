package com.devertelo.payments;

import com.ctrlbet.swagger.model.UserApiRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@ComponentScan(basePackages = {"com.devertelo.payments"})
public class PaymentsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PaymentsApplication.class, args);

        var jmsTemplate = context.getBean(JmsTemplate.class);
        UserApiRequest userRequest = new UserApiRequest().username("joao")
                .email("joao@gmail.com")
                .password("12345");
        jmsTemplate.convertAndSend("users",
                userRequest);

        UserApiRequest userRequest2 = new UserApiRequest().username("amanda")
                .email("amanda@gmail.com")
                .password("12345");
        jmsTemplate.convertAndSend("users",
                userRequest2);
    }

}
