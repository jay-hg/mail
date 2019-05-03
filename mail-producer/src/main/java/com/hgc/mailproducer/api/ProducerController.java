package com.hgc.mailproducer.api;

import com.hgc.common.dto.MailSendDTO;
import com.hgc.common.system.RestResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/producer")
@Slf4j
public class ProducerController {

    //send
//    @Transactional
    @RequestMapping(value = "/send", produces = "application/json;charset=UTF-8")
    public RestResult send(@Valid @RequestBody MailSendDTO mailSendDTO, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {
            return new RestResult(false, "2", "参数校验失败");
        }
        log.debug("接收到的参数，mailSendDTO:{}", mailSendDTO);
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
            log.error("异常信息：{}", e);
            throw new RuntimeException(e);
        }
        return new RestResult(true, "1", "成功");
    }
}
