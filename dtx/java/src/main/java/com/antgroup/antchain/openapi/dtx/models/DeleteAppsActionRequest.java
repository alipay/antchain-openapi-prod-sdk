// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DeleteAppsActionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与者id
    @NameInMap("action_id")
    @Validation(required = true)
    public Long actionId;

    // 00001
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static DeleteAppsActionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppsActionRequest self = new DeleteAppsActionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppsActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppsActionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAppsActionRequest setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public DeleteAppsActionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
