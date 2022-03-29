// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ExecSofamqConsumerresetoffsetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的单元
    // 
    // 
    @NameInMap("cell")
    public String cell;

    // 需查询的消费端 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 重置位点到指定的时间戳，仅在 Type 为 1 时生效。
    @NameInMap("reset_timestamp")
    public Long resetTimestamp;

    // 需重置位点的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 消息清理类型。取值说明如下：
    // 
    // 0：清除所有消息
    // 1：清理到指定时间
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    public static ExecSofamqConsumerresetoffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecSofamqConsumerresetoffsetRequest self = new ExecSofamqConsumerresetoffsetRequest();
        return TeaModel.build(map, self);
    }

    public ExecSofamqConsumerresetoffsetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecSofamqConsumerresetoffsetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecSofamqConsumerresetoffsetRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ExecSofamqConsumerresetoffsetRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExecSofamqConsumerresetoffsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecSofamqConsumerresetoffsetRequest setResetTimestamp(Long resetTimestamp) {
        this.resetTimestamp = resetTimestamp;
        return this;
    }
    public Long getResetTimestamp() {
        return this.resetTimestamp;
    }

    public ExecSofamqConsumerresetoffsetRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public ExecSofamqConsumerresetoffsetRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
