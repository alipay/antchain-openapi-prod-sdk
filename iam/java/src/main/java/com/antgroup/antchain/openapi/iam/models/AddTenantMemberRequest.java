// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AddTenantMemberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 操作员唯一id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

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

}
