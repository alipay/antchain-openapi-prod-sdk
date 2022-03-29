// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class PartitionStatus extends TeaModel {
    // 分区ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 消费位点
    @NameInMap("consume_offset")
    public Long consumeOffset;

    // 延迟时间
    @NameInMap("consume_time")
    public String consumeTime;

    // 积压数量
    @NameInMap("backlog_num")
    public Long backlogNum;

    public static PartitionStatus build(java.util.Map<String, ?> map) throws Exception {
        PartitionStatus self = new PartitionStatus();
        return TeaModel.build(map, self);
    }

    public PartitionStatus setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PartitionStatus setConsumeOffset(Long consumeOffset) {
        this.consumeOffset = consumeOffset;
        return this;
    }
    public Long getConsumeOffset() {
        return this.consumeOffset;
    }

    public PartitionStatus setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }
    public String getConsumeTime() {
        return this.consumeTime;
    }

    public PartitionStatus setBacklogNum(Long backlogNum) {
        this.backlogNum = backlogNum;
        return this;
    }
    public Long getBacklogNum() {
        return this.backlogNum;
    }

}
