// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateServiceaccountOnepartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 系统来源
    @NameInMap("source_system")
    @Validation(required = true)
    public String sourceSystem;

    public static CreateServiceaccountOnepartyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceaccountOnepartyRequest self = new CreateServiceaccountOnepartyRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceaccountOnepartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateServiceaccountOnepartyRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateServiceaccountOnepartyRequest setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }
    public String getSourceSystem() {
        return this.sourceSystem;
    }

}
