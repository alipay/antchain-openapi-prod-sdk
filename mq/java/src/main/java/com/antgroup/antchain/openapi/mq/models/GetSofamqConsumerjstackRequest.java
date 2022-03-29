// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqConsumerjstackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的单元
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 需要查询的消费端 Client ID
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 需要查询的消费端的 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 需要查询的消费者对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetSofamqConsumerjstackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqConsumerjstackRequest self = new GetSofamqConsumerjstackRequest();
        return TeaModel.build(map, self);
    }

    public GetSofamqConsumerjstackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSofamqConsumerjstackRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetSofamqConsumerjstackRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public GetSofamqConsumerjstackRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetSofamqConsumerjstackRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetSofamqConsumerjstackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
