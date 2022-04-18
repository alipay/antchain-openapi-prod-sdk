// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EventResultSyncDetail extends TeaModel {
    // 事件唯一id（单个租户全局唯一）
    @NameInMap("event_id")
    @Validation(required = true)
    public String eventId;

    // 营销计划id
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // 消息id
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 事件时间
    @NameInMap("event_time")
    @Validation(required = true)
    public String eventTime;

    // 事件类型：1为富信贴尾
    @NameInMap("event_type")
    @Validation(required = true)
    public Long eventType;

    // 1为成功 2为失败
    @NameInMap("state")
    @Validation(required = true)
    public Long state;

    // 用户key类型
    @NameInMap("key_type")
    @Validation(required = true)
    public String keyType;

    // 手机号
    @NameInMap("customer_key")
    @Validation(required = true)
    public String customerKey;

    // 扩展字段
    @NameInMap("ext_data")
    @Validation(required = true)
    public String extData;

    public static EventResultSyncDetail build(java.util.Map<String, ?> map) throws Exception {
        EventResultSyncDetail self = new EventResultSyncDetail();
        return TeaModel.build(map, self);
    }

    public EventResultSyncDetail setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public EventResultSyncDetail setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public EventResultSyncDetail setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public EventResultSyncDetail setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public EventResultSyncDetail setEventType(Long eventType) {
        this.eventType = eventType;
        return this;
    }
    public Long getEventType() {
        return this.eventType;
    }

    public EventResultSyncDetail setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public EventResultSyncDetail setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public EventResultSyncDetail setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
        return this;
    }
    public String getCustomerKey() {
        return this.customerKey;
    }

    public EventResultSyncDetail setExtData(String extData) {
        this.extData = extData;
        return this;
    }
    public String getExtData() {
        return this.extData;
    }

}
