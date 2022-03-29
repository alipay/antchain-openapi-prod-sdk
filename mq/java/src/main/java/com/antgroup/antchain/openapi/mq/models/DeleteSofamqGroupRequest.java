// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class DeleteSofamqGroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要删除的消息消费集群的 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需删除的 Group ID 对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static DeleteSofamqGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSofamqGroupRequest self = new DeleteSofamqGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSofamqGroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSofamqGroupRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteSofamqGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteSofamqGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
