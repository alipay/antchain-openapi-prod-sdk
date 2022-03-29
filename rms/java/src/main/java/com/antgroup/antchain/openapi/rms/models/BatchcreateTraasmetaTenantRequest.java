// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户列表
    @NameInMap("tenants")
    @Validation(required = true)
    public java.util.List<TraasTenantDto> tenants;

    public static BatchcreateTraasmetaTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaTenantRequest self = new BatchcreateTraasmetaTenantRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaTenantRequest setTenants(java.util.List<TraasTenantDto> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<TraasTenantDto> getTenants() {
        return this.tenants;
    }

}
