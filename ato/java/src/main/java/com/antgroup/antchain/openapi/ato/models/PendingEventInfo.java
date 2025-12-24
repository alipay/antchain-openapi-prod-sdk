// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PendingEventInfo extends TeaModel {
    // 事件id
    /**
     * <strong>example:</strong>
     * <p>12345678912</p>
     */
    @NameInMap("event_id")
    public String eventId;

    // 通知:NOTIFICATION
    // 确认函:CONFIRMATION
    /**
     * <strong>example:</strong>
     * <p>NOTIFICATION</p>
     */
    @NameInMap("type")
    public String type;

    // ("PENDING","待办中"),  ("CONFIRMED","确认"),  
    // ("REJECTED","已拒绝")
    // ("FAILED","失败"),("EXPIRED","已过期");
    /**
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("status")
    public String status;

    // 待办内容主题
    /**
     * <strong>example:</strong>
     * <p>用信确认函</p>
     */
    @NameInMap("content_subject")
    public String contentSubject;

    // 事件有效期开始
    /**
     * <strong>example:</strong>
     * <p>2024-08-27 14:07:46.600</p>
     */
    @NameInMap("effective_start_time")
    public String effectiveStartTime;

    // 事件有效期结束
    /**
     * <strong>example:</strong>
     * <p>2025-02-19 11:03:43.786</p>
     */
    @NameInMap("effective_end_time")
    public String effectiveEndTime;

    // 待办类型
    /**
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("content_type")
    public String contentType;

    // 待办详情，根据content_type可能为下载链接或者富文本
    /**
     * <strong>example:</strong>
     * <p><a href="http://123.docx">http://123.docx</a></p>
     */
    @NameInMap("content_details")
    public String contentDetails;

    public static PendingEventInfo build(java.util.Map<String, ?> map) throws Exception {
        PendingEventInfo self = new PendingEventInfo();
        return TeaModel.build(map, self);
    }

    public PendingEventInfo setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public PendingEventInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PendingEventInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PendingEventInfo setContentSubject(String contentSubject) {
        this.contentSubject = contentSubject;
        return this;
    }
    public String getContentSubject() {
        return this.contentSubject;
    }

    public PendingEventInfo setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public PendingEventInfo setEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public String getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public PendingEventInfo setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public PendingEventInfo setContentDetails(String contentDetails) {
        this.contentDetails = contentDetails;
        return this;
    }
    public String getContentDetails() {
        return this.contentDetails;
    }

}
