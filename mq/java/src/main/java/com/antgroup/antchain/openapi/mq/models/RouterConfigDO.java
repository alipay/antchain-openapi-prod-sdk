// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class RouterConfigDO extends TeaModel {
    // 消费端 Group
    @NameInMap("consumer_id")
    @Validation(required = true)
    public String consumerId;

    // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    @NameInMap("consume_from_type")
    @Validation(required = true)
    public Long consumeFromType;

    // 消费起始位点时间戳，时间戳的值，单位是秒
    @NameInMap("consume_from_value")
    @Validation(required = true)
    public Long consumeFromValue;

    // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    @NameInMap("consume_to_type")
    @Validation(required = true)
    public Long consumeToType;

    // 消费终止位点时间戳，时间戳的值，单位是秒
    @NameInMap("consume_to_value")
    @Validation(required = true)
    public Long consumeToValue;

    // 延迟时间
    @NameInMap("delay_time")
    public String delayTime;

    // 描述信息
    @NameInMap("description")
    public String description;

    // 目标单元
    @NameInMap("destination_cell")
    @Validation(required = true)
    public String destinationCell;

    // 目标实例 ID
    @NameInMap("destination_instance_id")
    @Validation(required = true)
    public String destinationInstanceId;

    // 目标 Topic
    @NameInMap("destination_topic")
    @Validation(required = true)
    public String destinationTopic;

    // 容灾标识
    @NameInMap("disaster")
    @Validation(required = true)
    public Boolean disaster;

    // 容灾机房
    @NameInMap("disaster_recovery_datacenter")
    @Validation(required = true)
    public String disasterRecoveryDatacenter;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    // 路由任务 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 源单元
    @NameInMap("source_cell")
    @Validation(required = true)
    public String sourceCell;

    // 源实例 ID
    @NameInMap("source_instance_id")
    @Validation(required = true)
    public String sourceInstanceId;

    // 源 Topic
    @NameInMap("source_topic")
    @Validation(required = true)
    public String sourceTopic;

    // 过滤 Tag
    @NameInMap("tag")
    @Validation(required = true)
    public String tag;

    // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
    @NameInMap("task_status")
    @Validation(required = true)
    public Long taskStatus;

    // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2...
    @NameInMap("task_type")
    @Validation(required = true)
    public Long taskType;

    public static RouterConfigDO build(java.util.Map<String, ?> map) throws Exception {
        RouterConfigDO self = new RouterConfigDO();
        return TeaModel.build(map, self);
    }

    public RouterConfigDO setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public RouterConfigDO setConsumeFromType(Long consumeFromType) {
        this.consumeFromType = consumeFromType;
        return this;
    }
    public Long getConsumeFromType() {
        return this.consumeFromType;
    }

    public RouterConfigDO setConsumeFromValue(Long consumeFromValue) {
        this.consumeFromValue = consumeFromValue;
        return this;
    }
    public Long getConsumeFromValue() {
        return this.consumeFromValue;
    }

    public RouterConfigDO setConsumeToType(Long consumeToType) {
        this.consumeToType = consumeToType;
        return this;
    }
    public Long getConsumeToType() {
        return this.consumeToType;
    }

    public RouterConfigDO setConsumeToValue(Long consumeToValue) {
        this.consumeToValue = consumeToValue;
        return this;
    }
    public Long getConsumeToValue() {
        return this.consumeToValue;
    }

    public RouterConfigDO setDelayTime(String delayTime) {
        this.delayTime = delayTime;
        return this;
    }
    public String getDelayTime() {
        return this.delayTime;
    }

    public RouterConfigDO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RouterConfigDO setDestinationCell(String destinationCell) {
        this.destinationCell = destinationCell;
        return this;
    }
    public String getDestinationCell() {
        return this.destinationCell;
    }

    public RouterConfigDO setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public RouterConfigDO setDestinationTopic(String destinationTopic) {
        this.destinationTopic = destinationTopic;
        return this;
    }
    public String getDestinationTopic() {
        return this.destinationTopic;
    }

    public RouterConfigDO setDisaster(Boolean disaster) {
        this.disaster = disaster;
        return this;
    }
    public Boolean getDisaster() {
        return this.disaster;
    }

    public RouterConfigDO setDisasterRecoveryDatacenter(String disasterRecoveryDatacenter) {
        this.disasterRecoveryDatacenter = disasterRecoveryDatacenter;
        return this;
    }
    public String getDisasterRecoveryDatacenter() {
        return this.disasterRecoveryDatacenter;
    }

    public RouterConfigDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RouterConfigDO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RouterConfigDO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RouterConfigDO setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

    public RouterConfigDO setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public RouterConfigDO setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

    public RouterConfigDO setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public RouterConfigDO setTaskStatus(Long taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Long getTaskStatus() {
        return this.taskStatus;
    }

    public RouterConfigDO setTaskType(Long taskType) {
        this.taskType = taskType;
        return this;
    }
    public Long getTaskType() {
        return this.taskType;
    }

}
