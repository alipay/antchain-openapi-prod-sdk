// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DetailInTopicDTO extends TeaModel {
    // 延迟时间
    @NameInMap("delay_time")
    @Validation(required = true)
    public Long delayTime;

    // 最后更新时间
    @NameInMap("last_timestamp")
    @Validation(required = true)
    public Long lastTimestamp;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 该 Topic 消费总堆积数
    @NameInMap("total_diff")
    @Validation(required = true)
    public Long totalDiff;

    public static DetailInTopicDTO build(java.util.Map<String, ?> map) throws Exception {
        DetailInTopicDTO self = new DetailInTopicDTO();
        return TeaModel.build(map, self);
    }

    public DetailInTopicDTO setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public DetailInTopicDTO setLastTimestamp(Long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }
    public Long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public DetailInTopicDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public DetailInTopicDTO setTotalDiff(Long totalDiff) {
        this.totalDiff = totalDiff;
        return this;
    }
    public Long getTotalDiff() {
        return this.totalDiff;
    }

}
