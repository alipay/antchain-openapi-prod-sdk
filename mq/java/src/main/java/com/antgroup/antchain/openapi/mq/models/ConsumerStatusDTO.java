// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumerStatusDTO extends TeaModel {
    // 该集群当前在线客户端信息
    @NameInMap("connection_set")
    @Validation(required = true)
    public java.util.List<ConnectionDTO> connectionSet;

    // 该集群在线客户端详细信息，包含 Jstack、消费 RT 时间等信息
    @NameInMap("consumer_connection_info_list")
    @Validation(required = true)
    public java.util.List<ConsumerConnectionInfoDTO> consumerConnectionInfoList;

    // 消费模型。取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
    @NameInMap("consume_model")
    @Validation(required = true)
    public String consumeModel;

    // 总消费 TPS
    @NameInMap("consume_tps")
    @Validation(required = true)
    public String consumeTps;

    // 延迟时间
    @NameInMap("delay_time")
    @Validation(required = true)
    public Long delayTime;

    // 各个 Topic 的消费情况
    @NameInMap("detail_in_topic_list")
    @Validation(required = true)
    public java.util.List<DetailInTopicDTO> detailInTopicList;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 最后更新时间
    @NameInMap("last_timestamp")
    @Validation(required = true)
    public Long lastTimestamp;

    // 是否在线
    @NameInMap("online")
    @Validation(required = true)
    public Boolean online;

    // 客户端 Rebalance 是否正常。取值说明如下：true：正常；false：不正常。
    @NameInMap("rebalance_ok")
    @Validation(required = true)
    public Boolean rebalanceOk;

    // 订阅关系是否一致
    @NameInMap("subscription_same")
    @Validation(required = true)
    public Boolean subscriptionSame;

    // 集群总的消费堆积
    @NameInMap("total_diff")
    @Validation(required = true)
    public Long totalDiff;

    public static ConsumerStatusDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumerStatusDTO self = new ConsumerStatusDTO();
        return TeaModel.build(map, self);
    }

    public ConsumerStatusDTO setConnectionSet(java.util.List<ConnectionDTO> connectionSet) {
        this.connectionSet = connectionSet;
        return this;
    }
    public java.util.List<ConnectionDTO> getConnectionSet() {
        return this.connectionSet;
    }

    public ConsumerStatusDTO setConsumerConnectionInfoList(java.util.List<ConsumerConnectionInfoDTO> consumerConnectionInfoList) {
        this.consumerConnectionInfoList = consumerConnectionInfoList;
        return this;
    }
    public java.util.List<ConsumerConnectionInfoDTO> getConsumerConnectionInfoList() {
        return this.consumerConnectionInfoList;
    }

    public ConsumerStatusDTO setConsumeModel(String consumeModel) {
        this.consumeModel = consumeModel;
        return this;
    }
    public String getConsumeModel() {
        return this.consumeModel;
    }

    public ConsumerStatusDTO setConsumeTps(String consumeTps) {
        this.consumeTps = consumeTps;
        return this;
    }
    public String getConsumeTps() {
        return this.consumeTps;
    }

    public ConsumerStatusDTO setDelayTime(Long delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public Long getDelayTime() {
        return this.delayTime;
    }

    public ConsumerStatusDTO setDetailInTopicList(java.util.List<DetailInTopicDTO> detailInTopicList) {
        this.detailInTopicList = detailInTopicList;
        return this;
    }
    public java.util.List<DetailInTopicDTO> getDetailInTopicList() {
        return this.detailInTopicList;
    }

    public ConsumerStatusDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConsumerStatusDTO setLastTimestamp(Long lastTimestamp) {
        this.lastTimestamp = lastTimestamp;
        return this;
    }
    public Long getLastTimestamp() {
        return this.lastTimestamp;
    }

    public ConsumerStatusDTO setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public ConsumerStatusDTO setRebalanceOk(Boolean rebalanceOk) {
        this.rebalanceOk = rebalanceOk;
        return this;
    }
    public Boolean getRebalanceOk() {
        return this.rebalanceOk;
    }

    public ConsumerStatusDTO setSubscriptionSame(Boolean subscriptionSame) {
        this.subscriptionSame = subscriptionSame;
        return this;
    }
    public Boolean getSubscriptionSame() {
        return this.subscriptionSame;
    }

    public ConsumerStatusDTO setTotalDiff(Long totalDiff) {
        this.totalDiff = totalDiff;
        return this;
    }
    public Long getTotalDiff() {
        return this.totalDiff;
    }

}
