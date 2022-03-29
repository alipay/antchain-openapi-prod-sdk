// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumptionStatusDTO extends TeaModel {
    // 实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消费端groupId
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 单元化cell
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 消费端是否在线
    @NameInMap("online")
    @Validation(required = true)
    public Boolean online;

    // 总的位点差
    @NameInMap("total_diff")
    @Validation(required = true)
    public Long totalDiff;

    // 所有订阅关系
    @NameInMap("subscriptions")
    @Validation(required = true)
    public java.util.List<SubscriptionDTO> subscriptions;

    // 消费者-队列状态
    @NameInMap("consumption_status")
    @Validation(required = true)
    public java.util.List<ConsumeQueueOffset> consumptionStatus;

    // 消费者客户端状态
    @NameInMap("clients")
    @Validation(required = true)
    public java.util.List<ClientInfoDTO> clients;

    public static ConsumptionStatusDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumptionStatusDTO self = new ConsumptionStatusDTO();
        return TeaModel.build(map, self);
    }

    public ConsumptionStatusDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConsumptionStatusDTO setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ConsumptionStatusDTO setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ConsumptionStatusDTO setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public ConsumptionStatusDTO setTotalDiff(Long totalDiff) {
        this.totalDiff = totalDiff;
        return this;
    }
    public Long getTotalDiff() {
        return this.totalDiff;
    }

    public ConsumptionStatusDTO setSubscriptions(java.util.List<SubscriptionDTO> subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }
    public java.util.List<SubscriptionDTO> getSubscriptions() {
        return this.subscriptions;
    }

    public ConsumptionStatusDTO setConsumptionStatus(java.util.List<ConsumeQueueOffset> consumptionStatus) {
        this.consumptionStatus = consumptionStatus;
        return this;
    }
    public java.util.List<ConsumeQueueOffset> getConsumptionStatus() {
        return this.consumptionStatus;
    }

    public ConsumptionStatusDTO setClients(java.util.List<ClientInfoDTO> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<ClientInfoDTO> getClients() {
        return this.clients;
    }

}
