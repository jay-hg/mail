package com.hgc.mailproducer.service;

import com.hgc.common.entity.MailSend;
import com.hgc.common.util.FastJsonConvertUtil;
import com.hgc.mailproducer.mq.Producer;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class ProduceService {
    @Autowired
    Producer producer;

    public void sendMq(MailSend mailSend) throws InterruptedException, RemotingException, MQClientException, MQBrokerException, UnsupportedEncodingException {
        //消息发到队列
        producer.send("testMail", "test", FastJsonConvertUtil.convertObjectToJSON(mailSend));
    }
}
