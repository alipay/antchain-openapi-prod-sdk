// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class UpdateTenantRatelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 更新列表
    @NameInMap("update_limit_list")
    @Validation(required = true)
    public java.util.List<UpdateRateLimit> updateLimitList;

    public static UpdateTenantRatelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantRatelimitRequest self = new UpdateTenantRatelimitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantRatelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTenantRatelimitRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateTenantRatelimitRequest setUpdateLimitList(java.util.List<UpdateRateLimit> updateLimitList) {
        this.updateLimitList = updateLimitList;
        return this;
    }
    public java.util.List<UpdateRateLimit> getUpdateLimitList() {
        return this.updateLimitList;
    }

}
