// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class AuthFileIntegrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权类型：BUCKET，OBJECT
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // object名称（当auth_type为OBJECT必填）
    @NameInMap("object_name")
    public String objectName;

    // 授权过期时间，格式为 yyyy-MM-dd HH:mm:ss
    @NameInMap("auth_expire_time")
    @Validation(required = true)
    public String authExpireTime;

    // 被授权的租户id
    @NameInMap("target_tenant")
    @Validation(required = true)
    public String targetTenant;

    public static AuthFileIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthFileIntegrationRequest self = new AuthFileIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public AuthFileIntegrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthFileIntegrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthFileIntegrationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public AuthFileIntegrationRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public AuthFileIntegrationRequest setAuthExpireTime(String authExpireTime) {
        this.authExpireTime = authExpireTime;
        return this;
    }
    public String getAuthExpireTime() {
        return this.authExpireTime;
    }

    public AuthFileIntegrationRequest setTargetTenant(String targetTenant) {
        this.targetTenant = targetTenant;
        return this;
    }
    public String getTargetTenant() {
        return this.targetTenant;
    }

}
