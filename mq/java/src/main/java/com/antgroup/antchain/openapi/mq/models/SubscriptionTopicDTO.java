// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SubscriptionTopicDTO extends TeaModel {
    // 是否在线
    @NameInMap("online")
    @Validation(required = true)
    public Boolean online;

    // 订阅匹配字符串
    @NameInMap("sub_string")
    @Validation(required = true)
    public String subString;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static SubscriptionTopicDTO build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionTopicDTO self = new SubscriptionTopicDTO();
        return TeaModel.build(map, self);
    }

    public SubscriptionTopicDTO setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public SubscriptionTopicDTO setSubString(String subString) {
        this.subString = subString;
        return this;
    }
    public String getSubString() {
        return this.subString;
    }

    public SubscriptionTopicDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
