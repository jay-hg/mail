package com.hgc.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * mail_send1
 * @author 
 */
public class MailSend implements Serializable {
    private String sendId;

    private String sendTo;

    private String sendMail;

    private String sendContent;

    private Long sendPriority;

    private Long sendCount;

    private String sendStatus;

    private String remark;

    private Long version;

    private String updateBy;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getSendMail() {
        return sendMail;
    }

    public void setSendMail(String sendMail) {
        this.sendMail = sendMail;
    }

    public String getSendContent() {
        return sendContent;
    }

    public void setSendContent(String sendContent) {
        this.sendContent = sendContent;
    }

    public Long getSendPriority() {
        return sendPriority;
    }

    public void setSendPriority(Long sendPriority) {
        this.sendPriority = sendPriority;
    }

    public Long getSendCount() {
        return sendCount;
    }

    public void setSendCount(Long sendCount) {
        this.sendCount = sendCount;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MailSend other = (MailSend) that;
        return (this.getSendId() == null ? other.getSendId() == null : this.getSendId().equals(other.getSendId()))
            && (this.getSendTo() == null ? other.getSendTo() == null : this.getSendTo().equals(other.getSendTo()))
            && (this.getSendMail() == null ? other.getSendMail() == null : this.getSendMail().equals(other.getSendMail()))
            && (this.getSendContent() == null ? other.getSendContent() == null : this.getSendContent().equals(other.getSendContent()))
            && (this.getSendPriority() == null ? other.getSendPriority() == null : this.getSendPriority().equals(other.getSendPriority()))
            && (this.getSendCount() == null ? other.getSendCount() == null : this.getSendCount().equals(other.getSendCount()))
            && (this.getSendStatus() == null ? other.getSendStatus() == null : this.getSendStatus().equals(other.getSendStatus()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSendId() == null) ? 0 : getSendId().hashCode());
        result = prime * result + ((getSendTo() == null) ? 0 : getSendTo().hashCode());
        result = prime * result + ((getSendMail() == null) ? 0 : getSendMail().hashCode());
        result = prime * result + ((getSendContent() == null) ? 0 : getSendContent().hashCode());
        result = prime * result + ((getSendPriority() == null) ? 0 : getSendPriority().hashCode());
        result = prime * result + ((getSendCount() == null) ? 0 : getSendCount().hashCode());
        result = prime * result + ((getSendStatus() == null) ? 0 : getSendStatus().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sendId=").append(sendId);
        sb.append(", sendTo=").append(sendTo);
        sb.append(", sendMail=").append(sendMail);
        sb.append(", sendContent=").append(sendContent);
        sb.append(", sendPriority=").append(sendPriority);
        sb.append(", sendCount=").append(sendCount);
        sb.append(", sendStatus=").append(sendStatus);
        sb.append(", remark=").append(remark);
        sb.append(", version=").append(version);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}