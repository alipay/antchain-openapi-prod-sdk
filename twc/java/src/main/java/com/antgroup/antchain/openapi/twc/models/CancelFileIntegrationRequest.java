// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CancelFileIntegrationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被授权目标租户ID
    @NameInMap("target_tenant")
    @Validation(required = true)
    public String targetTenant;

    // 授权类型：BUCKET，OBJECT
    @NameInMap("auth_type")
    @Validation(required = true)
    public String authType;

    // object名称（当auth_type为OBJECT必填）	
    @NameInMap("object_name")
    public String objectName;

    public static CancelFileIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelFileIntegrationRequest self = new CancelFileIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public CancelFileIntegrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelFileIntegrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelFileIntegrationRequest setTargetTenant(String targetTenant) {
        this.targetTenant = targetTenant;
        return this;
    }
    public String getTargetTenant() {
        return this.targetTenant;
    }

    public CancelFileIntegrationRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public CancelFileIntegrationRequest setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

}
