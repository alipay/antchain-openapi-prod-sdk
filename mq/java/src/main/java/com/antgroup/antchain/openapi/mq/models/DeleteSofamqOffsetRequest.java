// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSofamqOffsetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需清除消费进度的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需清除消费进度的消费端 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需清除消费进度的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 需要清除消费进度的单元
    @NameInMap("cells")
    @Validation(required = true)
    public String cells;

    public static DeleteSofamqOffsetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSofamqOffsetRequest self = new DeleteSofamqOffsetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSofamqOffsetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSofamqOffsetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSofamqOffsetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteSofamqOffsetRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteSofamqOffsetRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public DeleteSofamqOffsetRequest setCells(String cells) {
        this.cells = cells;
        return this;
    }
    public String getCells() {
        return this.cells;
    }

}
