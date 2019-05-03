package com.hgc.mailproducer.api;

import com.hgc.common.constant.Const;
import com.hgc.common.dto.MailSendDTO;
import com.hgc.common.entity.MailSend;
import com.hgc.common.enumeration.MailStatus;
import com.hgc.common.util.KeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
@Slf4j
public class ProducerController {

    //send
//    @Transactional
    @RequestMapping(value = "/send",produces = "application/json;charset=UTF-8")
    public void send(@RequestBody MailSendDTO mailSendDTO) throws Exception {
        log.info("接收到的参数，mailSendDTO:{}",mailSendDTO);
        // try catch ------------>
        // 1 尽量缩小代码的范围，捕获细粒度的异常 既然catch 那么一定要处理
        // 2 如果是有事务存在的，那么catch的时候一定要进行手工回滚异常
        try {
            //1.MailSend validate ---> validate数据校验

            //2.insert
            /*mailSend.setSendId(KeyUtil.generateUUID());
            mailSend.setSendStatus(MailStatus.DRAFT.getCode());
            mailSend.setSendCount(0L);
            mailSend.setVersion(0L);
            mailSend.setUpdateBy(Const.SYS_RUNTIME);*/
//            mailSendService.insert(mailSend);

            //3.数据写到redis上
//            mailSendService.sendMq(mailSend);
        } catch (Exception e) {
            //记录日志
            log.error("异常信息：{}",e);
            throw new RuntimeException(e);
        }
    }
}
