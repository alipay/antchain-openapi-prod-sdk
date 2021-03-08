// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 角色ID
    @NameInMap("role_id")
    @Validation(required = true)
    public String roleId;

    // 名称
    @NameInMap("name")
    public String name;

    // 描述
    @NameInMap("description")
    public String description;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public UpdateRoleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
