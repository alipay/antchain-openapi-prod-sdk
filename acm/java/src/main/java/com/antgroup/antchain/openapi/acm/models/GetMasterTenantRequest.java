// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetMasterTenantRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 主账号id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static GetMasterTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMasterTenantRequest self = new GetMasterTenantRequest();
        return TeaModel.build(map, self);
    }

    public GetMasterTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMasterTenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
