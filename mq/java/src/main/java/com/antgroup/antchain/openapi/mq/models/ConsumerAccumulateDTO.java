// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumerAccumulateDTO extends TeaModel {
    // 该 Group ID 下消费者实例群组接收消息的总 TPS
    @NameInMap("consume_tps")
    @Validation(required = true)
    public String consumeTps;

    // 该 Topic 所发消息的最大消费延迟时间
    @NameInMap("delay_time")
    @Validation(required = true)
    public Long delayTime;

    // 各个 Topic 具体情况
    @NameInMap("detail_in_topic_list")
    @Validation(required = true)
    public java.util.List<DetailInTopicDTO> detailInTopicList;

    // 该 Topic 中最近一条被消费的信息的生产时间
    @NameInMap("last_timestamp")
    @Validation(required = true)
    public Long lastTimestamp;

    // 该 Group ID 下是否有消费者实例在线；只要有一个消费者实例在线，该 Group ID 状态即为在线。取值说明如下：
    // 
    // true：状态为在线
    // false：状态为不在线
    @NameInMap("online")
    @Validation(required = true)
    public Boolean online;

    // 该 Topic 的消费堆积数量
    @NameInMap("total_diff")
    @Validation(required = true)
    public Long totalDiff;

    public static ConsumerAccumulateDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumerAccumulateDTO self = new ConsumerAccumulateDTO();
        return TeaModel.build(map, self);
    }

    public ConsumerAccumulateDTO setConsumeTps(String consumeTps) {
        this.consumeTps = consumeTps;
        return this;
    }
    public String getConsumeTps() {
        return this.consumeTps;
    }

    public ConsumerAccumulateDTO setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public ConsumerAccumulateDTO setDetailInTopicList(java.util.List<DetailInTopicDTO> detailInTopicList) {
        this.detailInTopicList = detailInTopicList;
        return this;
    }
    public java.util.List<DetailInTopicDTO> getDetailInTopicList() {
        return this.detailInTopicList;
    }

    public ConsumerAccumulateDTO setLastTimestamp(Long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }
    public Long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public ConsumerAccumulateDTO setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public ConsumerAccumulateDTO setTotalDiff(Long totalDiff) {
        this.totalDiff = totalDiff;
        return this;
    }
    public Long getTotalDiff() {
        return this.totalDiff;
    }

}
