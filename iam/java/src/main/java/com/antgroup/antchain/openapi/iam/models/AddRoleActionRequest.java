// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AddRoleActionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 角色ID
    @NameInMap("role_id")
    @Validation(required = true)
    public String roleId;

    // 权限码
    @NameInMap("actions")
    @Validation(required = true)
    public java.util.List<String> actions;

    public static AddRoleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRoleActionRequest self = new AddRoleActionRequest();
        return TeaModel.build(map, self);
    }

    public AddRoleActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddRoleActionRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AddRoleActionRequest setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

}
