// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TopicQueueDTO extends TeaModel {
    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // Broker 名称
    @NameInMap("broker_name")
    @Validation(required = true)
    public String brokerName;

    // brokerip地址
    @NameInMap("broker_addr_str")
    @Validation(required = true)
    public String brokerAddrStr;

    // 最后更新时间
    @NameInMap("last_update_timestamp")
    @Validation(required = true)
    public Long lastUpdateTimestamp;

    // 最大 offset 位点
    @NameInMap("max_offset")
    @Validation(required = true)
    public Long maxOffset;

    // 最小位点
    @NameInMap("min_offset")
    @Validation(required = true)
    public Long minOffset;

    // 队列 ID
    @NameInMap("queue_id")
    @Validation(required = true)
    public Long queueId;

    public static TopicQueueDTO build(java.util.Map<String, ?> map) throws Exception {
        TopicQueueDTO self = new TopicQueueDTO();
        return TeaModel.build(map, self);
    }

    public TopicQueueDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public TopicQueueDTO setBrokerName(String brokerName) {
        this.brokerName = brokerName;
        return this;
    }
    public String getBrokerName() {
        return this.brokerName;
    }

    public TopicQueueDTO setBrokerAddrStr(String brokerAddrStr) {
        this.brokerAddrStr = brokerAddrStr;
        return this;
    }
    public String getBrokerAddrStr() {
        return this.brokerAddrStr;
    }

    public TopicQueueDTO setLastUpdateTimestamp(Long lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        return this;
    }
    public Long getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    public TopicQueueDTO setMaxOffset(Long maxOffset) {
        this.maxOffset = maxOffset;
        return this;
    }
    public Long getMaxOffset() {
        return this.maxOffset;
    }

    public TopicQueueDTO setMinOffset(Long minOffset) {
        this.minOffset = minOffset;
        return this;
    }
    public Long getMinOffset() {
        return this.minOffset;
    }

    public TopicQueueDTO setQueueId(Long queueId) {
        this.queueId = queueId;
        return this;
    }
    public Long getQueueId() {
        return this.queueId;
    }

}
