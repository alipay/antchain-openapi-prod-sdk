// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class CreateRoleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 描述
    @NameInMap("description")
    public String description;

    // 权限码列表
    @NameInMap("actions")
    public java.util.List<String> actions;

    public static CreateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoleRequest self = new CreateRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRoleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRoleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRoleRequest setActions(java.util.List<String> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<String> getActions() {
        return this.actions;
    }

}
