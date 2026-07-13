// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class RemoveTenantBusinesstagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务场景码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 业务场景的权限吗
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    public static RemoveTenantBusinesstagRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTenantBusinesstagRequest self = new RemoveTenantBusinesstagRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTenantBusinesstagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RemoveTenantBusinesstagRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RemoveTenantBusinesstagRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public RemoveTenantBusinesstagRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
