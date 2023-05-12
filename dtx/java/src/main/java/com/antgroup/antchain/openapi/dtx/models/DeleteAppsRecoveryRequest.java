// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class DeleteAppsRecoveryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 000001
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 发起方id
    @NameInMap("recovery_id")
    @Validation(required = true)
    public Long recoveryId;

    public static DeleteAppsRecoveryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppsRecoveryRequest self = new DeleteAppsRecoveryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppsRecoveryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAppsRecoveryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAppsRecoveryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAppsRecoveryRequest setRecoveryId(Long recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }
    public Long getRecoveryId() {
        return this.recoveryId;
    }

}
