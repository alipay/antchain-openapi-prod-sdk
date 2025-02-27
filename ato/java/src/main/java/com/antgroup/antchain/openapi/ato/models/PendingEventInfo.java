// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PendingEventInfo extends TeaModel {
    // 事件id
    @NameInMap("event_id")
    public String eventId;

    // 通知:NOTIFICATION
    // 确认函:CONFIRMATION
    @NameInMap("type")
    public String type;

    // ("PENDING","待办中"),  ("CONFIRMED","确认"),  
    // ("REJECTED","已拒绝")
    // ("FAILED","失败"),("EXPIRED","已过期");
    @NameInMap("status")
    public String status;

    // 待办内容主题
    @NameInMap("content_subject")
    public String contentSubject;

    // 事件有效期开始
    @NameInMap("effective_start_time")
    public String effectiveStartTime;

    // 事件有效期结束
    @NameInMap("effective_end_time")
    public String effectiveEndTime;

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

}
