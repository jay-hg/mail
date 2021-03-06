package com.hgc.common.service;

import com.hgc.common.entity.MailSend;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author acai
 * @since 2019-05-08
 */
public interface IMailSendService extends IService<MailSend> {
    public void insert(MailSend mailSend);
    public void sendMq(MailSend mailSend);
}
