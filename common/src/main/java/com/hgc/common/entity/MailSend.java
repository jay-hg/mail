package com.hgc.common.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author acai
 * @since 2019-05-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MailSend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("SEND_ID")
    private String sendId;

    @TableField("SEND_TO")
    private String sendTo;

    @TableField("SEND_MAIL")
    private String sendMail;

    @TableField("SEND_CONTENT")
    private String sendContent;

    @TableField("SEND_PRIORITY")
    private Long sendPriority;

    @TableField("SEND_COUNT")
    private Long sendCount;

    @TableField("SEND_STATUS")
    private String sendStatus;

    @TableField("REMARK")
    private String remark;

    @TableField("VERSION")
    private Long version;

    @TableField("UPDATE_BY")
    private String updateBy;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;


}
