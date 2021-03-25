// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ListRoleOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 角色ID
    @NameInMap("role_id")
    @Validation(required = true)
    public String roleId;

    // 租户信息
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    public static ListRoleOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoleOperatorRequest self = new ListRoleOperatorRequest();
        return TeaModel.build(map, self);
    }

    public ListRoleOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListRoleOperatorRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public ListRoleOperatorRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
