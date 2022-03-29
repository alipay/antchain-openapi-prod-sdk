// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TopicSubDetailDTO extends TeaModel {
    // 最近发送时间
    @NameInMap("latest_send_time")
    @Validation(required = true)
    public Long latestSendTime;

    // SubscriptionData 数组
    @NameInMap("subscription_data_list")
    @Validation(required = true)
    public java.util.List<SubscriptionGroupDTO> subscriptionDataList;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static TopicSubDetailDTO build(java.util.Map<String, ?> map) throws Exception {
        TopicSubDetailDTO self = new TopicSubDetailDTO();
        return TeaModel.build(map, self);
    }

    public TopicSubDetailDTO setLatestSendTime(Long latestSendTime) {
        this.latestSendTime = latestSendTime;
        return this;
    }
    public Long getLatestSendTime() {
        return this.latestSendTime;
    }

    public TopicSubDetailDTO setSubscriptionDataList(java.util.List<SubscriptionGroupDTO> subscriptionDataList) {
        this.subscriptionDataList = subscriptionDataList;
        return this;
    }
    public java.util.List<SubscriptionGroupDTO> getSubscriptionDataList() {
        return this.subscriptionDataList;
    }

    public TopicSubDetailDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
