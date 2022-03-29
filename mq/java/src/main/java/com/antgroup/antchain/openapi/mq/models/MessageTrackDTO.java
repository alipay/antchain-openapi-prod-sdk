// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class MessageTrackDTO extends TeaModel {
    // 订阅该 Topic 的消费者所对应的 Group ID
    @NameInMap("consumer_group")
    @Validation(required = true)
    public String consumerGroup;

    // 需查询的消息所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 当前状态。取值说明如下：
    // 
    // CONSUMED：已消费
    // CONSUMED_BUT_FILTERED：已被过滤
    // NOT_CONSUME_YET：暂未消费
    // NOT_ONLINE：客户端不在线
    // UNKNOWN：其他问题
    // 
    @NameInMap("track_type")
    @Validation(required = true)
    public String trackType;

    public static MessageTrackDTO build(java.util.Map<String, ?> map) throws Exception {
        MessageTrackDTO self = new MessageTrackDTO();
        return TeaModel.build(map, self);
    }

    public MessageTrackDTO setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    public MessageTrackDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MessageTrackDTO setTrackType(String trackType) {
        this.trackType = trackType;
        return this;
    }
    public String getTrackType() {
        return this.trackType;
    }

}
