// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class SyncTenantInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 账号ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static SyncTenantInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTenantInfoRequest self = new SyncTenantInfoRequest();
        return TeaModel.build(map, self);
    }

    public SyncTenantInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTenantInfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
