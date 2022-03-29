// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class EventSubConfig extends TeaModel {
    // 配置是否开启
    @NameInMap("enabled")
    @Validation(required = true)
    public Boolean enabled;

    // 事件类型数组
    @NameInMap("event_types")
    @Validation(required = true)
    public java.util.List<String> eventTypes;

    // 事件触发通知类型
    @NameInMap("trigger_type")
    @Validation(required = true)
    public String triggerType;

    // 钉钉通知的webhook
    @NameInMap("webhook")
    public String webhook;

    // http 连接
    @NameInMap("http_url")
    public String httpUrl;

    // topic
    @NameInMap("topic")
    public String topic;

    // tag
    @NameInMap("tag")
    public String tag;

    public static EventSubConfig build(java.util.Map<String, ?> map) throws Exception {
        EventSubConfig self = new EventSubConfig();
        return TeaModel.build(map, self);
    }

    public EventSubConfig setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public EventSubConfig setEventTypes(java.util.List<String> eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public java.util.List<String> getEventTypes() {
        return this.eventTypes;
    }

    public EventSubConfig setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public EventSubConfig setWebhook(String webhook) {
        this.webhook = webhook;
        return this;
    }
    public String getWebhook() {
        return this.webhook;
    }

    public EventSubConfig setHttpUrl(String httpUrl) {
        this.httpUrl = httpUrl;
        return this;
    }
    public String getHttpUrl() {
        return this.httpUrl;
    }

    public EventSubConfig setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public EventSubConfig setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
