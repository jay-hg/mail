package com.hgc.common.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class MailSendDTO {
    @NotEmpty(message = "[sendTo]不能为空")
    private String sendTo;

    @NotEmpty(message = "[sendMail]不能为空")
    private String sendMail;

    @NotEmpty(message = "[sendContent]不能为空")
    private String sendContent;

    private Long sendPriority;
}
