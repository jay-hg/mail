package com.hgc.common.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class MailSendDTO {
    @NotEmpty
    private String sendTo;

    @NotEmpty
    private String sendMail;

    @NotEmpty
    private String sendContent;

    @NotEmpty
    private Long sendPriority;
}
