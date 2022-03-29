// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqRouterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 消费端 Group
    @NameInMap("consumer_id")
    public String consumerId;

    // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    @NameInMap("consume_from_type")
    @Validation(required = true)
    public Long consumeFromType;

    // 消费起始位点时间戳，时间戳的值，单位是秒
    @NameInMap("consume_from_value")
    public Long consumeFromValue;

    // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
    @NameInMap("consume_to_type")
    public Long consumeToType;

    // 消费终止位点时间戳，时间戳的值，单位是秒
    @NameInMap("consume_to_value")
    public Long consumeToValue;

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
    public Boolean disaster;

    // 容灾机房
    @NameInMap("disaster_recovery_datacenter")
    public String disasterRecoveryDatacenter;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

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
    public String tag;

    // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
    @NameInMap("task_status")
    public Long taskStatus;

    // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2：LDC 容灾。	
    @NameInMap("task_type")
    @Validation(required = true)
    public Long taskType;

    public static CreateSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqRouterRequest self = new CreateSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqRouterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqRouterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqRouterRequest setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public CreateSofamqRouterRequest setConsumeFromType(Long consumeFromType) {
        this.consumeFromType = consumeFromType;
        return this;
    }
    public Long getConsumeFromType() {
        return this.consumeFromType;
    }

    public CreateSofamqRouterRequest setConsumeFromValue(Long consumeFromValue) {
        this.consumeFromValue = consumeFromValue;
        return this;
    }
    public Long getConsumeFromValue() {
        return this.consumeFromValue;
    }

    public CreateSofamqRouterRequest setConsumeToType(Long consumeToType) {
        this.consumeToType = consumeToType;
        return this;
    }
    public Long getConsumeToType() {
        return this.consumeToType;
    }

    public CreateSofamqRouterRequest setConsumeToValue(Long consumeToValue) {
        this.consumeToValue = consumeToValue;
        return this;
    }
    public Long getConsumeToValue() {
        return this.consumeToValue;
    }

    public CreateSofamqRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSofamqRouterRequest setDestinationCell(String destinationCell) {
        this.destinationCell = destinationCell;
        return this;
    }
    public String getDestinationCell() {
        return this.destinationCell;
    }

    public CreateSofamqRouterRequest setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public CreateSofamqRouterRequest setDestinationTopic(String destinationTopic) {
        this.destinationTopic = destinationTopic;
        return this;
    }
    public String getDestinationTopic() {
        return this.destinationTopic;
    }

    public CreateSofamqRouterRequest setDisaster(Boolean disaster) {
        this.disaster = disaster;
        return this;
    }
    public Boolean getDisaster() {
        return this.disaster;
    }

    public CreateSofamqRouterRequest setDisasterRecoveryDatacenter(String disasterRecoveryDatacenter) {
        this.disasterRecoveryDatacenter = disasterRecoveryDatacenter;
        return this;
    }
    public String getDisasterRecoveryDatacenter() {
        return this.disasterRecoveryDatacenter;
    }

    public CreateSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqRouterRequest setSourceCell(String sourceCell) {
        this.sourceCell = sourceCell;
        return this;
    }
    public String getSourceCell() {
        return this.sourceCell;
    }

    public CreateSofamqRouterRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateSofamqRouterRequest setSourceTopic(String sourceTopic) {
        this.sourceTopic = sourceTopic;
        return this;
    }
    public String getSourceTopic() {
        return this.sourceTopic;
    }

    public CreateSofamqRouterRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public CreateSofamqRouterRequest setTaskStatus(Long taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Long getTaskStatus() {
        return this.taskStatus;
    }

    public CreateSofamqRouterRequest setTaskType(Long taskType) {
        this.taskType = taskType;
        return this;
    }
    public Long getTaskType() {
        return this.taskType;
    }

}
