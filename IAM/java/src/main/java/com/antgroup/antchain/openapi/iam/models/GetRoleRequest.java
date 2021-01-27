// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetRoleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 角色ID
    @NameInMap("role_id")
    @Validation(required = true)
    public String roleId;

    public static GetRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoleRequest self = new GetRoleRequest();
        return TeaModel.build(map, self);
    }

    public GetRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
