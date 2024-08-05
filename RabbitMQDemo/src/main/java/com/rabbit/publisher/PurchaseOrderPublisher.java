package com.rabbit.publisher;


import com.rabbit.model.OrderStatus;
import com.rabbit.model.PurchaseOrder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class PurchaseOrderPublisher {

    @Autowired
    private RabbitTemplate template;

    @Value("${ust.rabbitmq.queue}")
    String queuename;

    @Value("${ust.rabbitmq.exchange}")
    String exchange;

    @Value("${ust.rabbitmq.routingkey}")
    private String routingKey;

    @PostMapping("/{customerName}")
    public String bookOrder(@RequestBody PurchaseOrder order, @PathVariable String customerName){
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(order,"ACCEPTED","Order places successfully by "+customerName);
        template.convertAndSend(exchange,routingKey,orderStatus);
        return "Success";
    }

}
