package com.hgc.common.service.impl;

import com.hgc.common.entity.MailSend;
import com.hgc.common.mapper.MailSendMapper;
import com.hgc.common.service.IMailSendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author acai
 * @since 2019-05-08
 */
@Service
public class MailSendServiceImpl extends ServiceImpl<MailSendMapper, MailSend> implements IMailSendService {

    @Autowired
    MailSendMapper mailSendMapper;

    @Override
    public void insert(MailSend mailSend) {
        mailSendMapper.insert(mailSend);
    }

    @Override
    public void sendMq(MailSend mailSend) {

    }
}
