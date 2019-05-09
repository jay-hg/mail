package com.hgc.mailproducer.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.UnsupportedEncodingException;

@Component
@Slf4j
public class Producer {
    private DefaultMQProducer producer;

    @Value("${apache.rocketmq.producer.producerGroup}")
    private String producerGroup;

    @Value("${apache.rocketmq.namesrvAddr}")
    private String nameSrv;

    @PostConstruct
    public void defaultMqProducer() {
        producer = new DefaultMQProducer(producerGroup);
        // Specify name server addresses.
        producer.setNamesrvAddr(nameSrv);
        //Launch the instance.
        try {
            producer.start();
            log.info("--------producer started-------");
        } catch (MQClientException e) {
            e.printStackTrace();
        }
    }

    public SendResult send(String topic, String tags, String body) throws UnsupportedEncodingException, InterruptedException, RemotingException, MQClientException, MQBrokerException {
        //Create a message instance, specifying topic, tag and message body.
        Message msg = new Message(topic,
                tags,
                body.getBytes(RemotingHelper.DEFAULT_CHARSET)
        );
        //Call send message to deliver message to one of brokers.
        SendResult sendResult = producer.send(msg);
        log.info("发送消息到mq,sendResult：{}", sendResult);
        return sendResult;
    }
}
