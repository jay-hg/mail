package com.hgc.mailconsumer.mq;

import com.hgc.common.entity.MailSend;
import com.hgc.common.util.FastJsonConvertUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Component
@Slf4j
public class Consumer {
    private DefaultMQPushConsumer consumer;

    @Value("${apache.rocketmq.consumer.consumerGroup}")
    private String consumerGroup;

    @Value("${apache.rocketmq.namesrvAddr}")
    private String nameSrv;

    @PostConstruct
    public void init() throws InterruptedException, MQClientException {

        // Instantiate with specified mq group name.
        consumer = new DefaultMQPushConsumer(consumerGroup);

        // Specify name server addresses.
        consumer.setNamesrvAddr(nameSrv);

        // Subscribe one more more topics to consume.
        consumer.subscribe("testMail", "*");
        // Register callback to execute on arrival of messages fetched from brokers.
        consumer.registerMessageListener(new MessageListenerConcurrently() {

            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs,
                                                            ConsumeConcurrentlyContext context) {
                System.out.printf("%s Receive New Messages: %s %n", Thread.currentThread().getName(), msgs);
                for (MessageExt msg : msgs) {
                    log.info("从mq获取msg:{}",msg);
                    String mailJson = null;
                    try {
                        mailJson = new String(msg.getBody(),"UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    MailSend mailSend = FastJsonConvertUtil.convertJSONToObject(mailJson, MailSend.class);
                    log.info("即将消费，mailSend:{}",mailSend);
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });

        //Launch the mq instance.
        consumer.start();

        System.out.printf("Consumer Started.%n");
    }
}
