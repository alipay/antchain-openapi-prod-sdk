// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CloseDataauthorizationAuthorizationServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 关闭服务原因
    @NameInMap("remark")
    public String remark;

    public static CloseDataauthorizationAuthorizationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseDataauthorizationAuthorizationServiceRequest self = new CloseDataauthorizationAuthorizationServiceRequest();
        return TeaModel.build(map, self);
    }

    public CloseDataauthorizationAuthorizationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloseDataauthorizationAuthorizationServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloseDataauthorizationAuthorizationServiceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CloseDataauthorizationAuthorizationServiceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
