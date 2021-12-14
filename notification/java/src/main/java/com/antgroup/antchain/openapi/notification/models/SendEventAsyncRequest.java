// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class SendEventAsyncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 事件码
    @NameInMap("event_code")
    @Validation(required = true)
    public String eventCode;

    // 事件上下文，用于填充消息模板里的参数
    @NameInMap("event_params")
    public java.util.List<KeyValuePair> eventParams;

    // 消息接收人，对应自定义人群
    @NameInMap("event_receivers")
    public java.util.List<EventReceiver> eventReceivers;

    // 租户信息，对应智科用户群组
    @NameInMap("event_tenant")
    public EventTenant eventTenant;

    // 事件资源，据此查询相关的内部小二群组
    @NameInMap("event_resources")
    public java.util.List<EventResource> eventResources;

    // 发送方，用于查询结果，可以是系统名、产品码、员工工号等等
    @NameInMap("sender")
    @Validation(required = true)
    public String sender;

    // 描述sender
    @NameInMap("sender_name")
    public String senderName;

    public static SendEventAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        SendEventAsyncRequest self = new SendEventAsyncRequest();
        return TeaModel.build(map, self);
    }

    public SendEventAsyncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendEventAsyncRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public SendEventAsyncRequest setEventParams(java.util.List<KeyValuePair> eventParams) {
        this.eventParams = eventParams;
        return this;
    }
    public java.util.List<KeyValuePair> getEventParams() {
        return this.eventParams;
    }

    public SendEventAsyncRequest setEventReceivers(java.util.List<EventReceiver> eventReceivers) {
        this.eventReceivers = eventReceivers;
        return this;
    }
    public java.util.List<EventReceiver> getEventReceivers() {
        return this.eventReceivers;
    }

    public SendEventAsyncRequest setEventTenant(EventTenant eventTenant) {
        this.eventTenant = eventTenant;
        return this;
    }
    public EventTenant getEventTenant() {
        return this.eventTenant;
    }

    public SendEventAsyncRequest setEventResources(java.util.List<EventResource> eventResources) {
        this.eventResources = eventResources;
        return this;
    }
    public java.util.List<EventResource> getEventResources() {
        return this.eventResources;
    }

    public SendEventAsyncRequest setSender(String sender) {
        this.sender = sender;
        return this;
    }
    public String getSender() {
        return this.sender;
    }

    public SendEventAsyncRequest setSenderName(String senderName) {
        this.senderName = senderName;
        return this;
    }
    public String getSenderName() {
        return this.senderName;
    }

}
