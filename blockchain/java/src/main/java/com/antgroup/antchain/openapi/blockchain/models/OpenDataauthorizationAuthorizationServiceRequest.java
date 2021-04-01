// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OpenDataauthorizationAuthorizationServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true, maxLength = 50)
    public String tenantId;

    // 租户AK
    @NameInMap("tenant_access_key")
    public String tenantAccessKey;

    // 开通原因
    @NameInMap("remark")
    @Validation(maxLength = 255)
    public String remark;

    public static OpenDataauthorizationAuthorizationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenDataauthorizationAuthorizationServiceRequest self = new OpenDataauthorizationAuthorizationServiceRequest();
        return TeaModel.build(map, self);
    }

    public OpenDataauthorizationAuthorizationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OpenDataauthorizationAuthorizationServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OpenDataauthorizationAuthorizationServiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OpenDataauthorizationAuthorizationServiceRequest setTenantAccessKey(String tenantAccessKey) {
        this.tenantAccessKey = tenantAccessKey;
        return this;
    }
    public String getTenantAccessKey() {
        return this.tenantAccessKey;
    }

    public OpenDataauthorizationAuthorizationServiceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
