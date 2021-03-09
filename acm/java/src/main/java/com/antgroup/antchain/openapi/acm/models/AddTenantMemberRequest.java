// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class AddTenantMemberRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作员唯一id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 操作员唯一id
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static AddTenantMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTenantMemberRequest self = new AddTenantMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddTenantMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddTenantMemberRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AddTenantMemberRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
