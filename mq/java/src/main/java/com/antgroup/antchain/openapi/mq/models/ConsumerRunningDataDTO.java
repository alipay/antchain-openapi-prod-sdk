// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumerRunningDataDTO extends TeaModel {
    // 堆积量
    @NameInMap("diff")
    @Validation(required = true)
    public Long diff;

    // 每小时内消费失败的消息数统计
    @NameInMap("failed_count_per_hour")
    @Validation(required = true)
    public Long failedCountPerHour;

    // 消费消息失败的 TPS 统计
    @NameInMap("failed_tps")
    @Validation(required = true)
    public String failedTps;

    // 订阅方的 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 消费消息成功的 TPS 统计
    @NameInMap("ok_tps")
    @Validation(required = true)
    public String okTps;

    // 消费 RT 时间，单位 ms
    @NameInMap("rt")
    @Validation(required = true)
    public String rt;

    // 订阅的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static ConsumerRunningDataDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumerRunningDataDTO self = new ConsumerRunningDataDTO();
        return TeaModel.build(map, self);
    }

    public ConsumerRunningDataDTO setDiff(Long diff) {
        this.diff = diff;
        return this;
    }
    public Long getDiff() {
        return this.diff;
    }

    public ConsumerRunningDataDTO setFailedCountPerHour(Long failedCountPerHour) {
        this.failedCountPerHour = failedCountPerHour;
        return this;
    }
    public Long getFailedCountPerHour() {
        return this.failedCountPerHour;
    }

    public ConsumerRunningDataDTO setFailedTps(String failedTps) {
        this.failedTps = failedTps;
        return this;
    }
    public String getFailedTps() {
        return this.failedTps;
    }

    public ConsumerRunningDataDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ConsumerRunningDataDTO setOkTps(String okTps) {
        this.okTps = okTps;
        return this;
    }
    public String getOkTps() {
        return this.okTps;
    }

    public ConsumerRunningDataDTO setRt(String rt) {
        this.rt = rt;
        return this;
    }
    public String getRt() {
        return this.rt;
    }

    public ConsumerRunningDataDTO setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
