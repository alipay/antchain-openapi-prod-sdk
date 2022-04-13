// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateDbflowObtenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 描述信息
    @NameInMap("description")
    public String description;

    // 租户扩展属性，格式为序列化后的json字符串
    @NameInMap("extend_properties")
    public String extendProperties;

    // OB租户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 用于存放对应的业务库租户类型：单库类型或分片库
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 租户存放的uid段，用于存放对应业务分片库
    @NameInMap("uids")
    public java.util.List<Long> uids;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static CreateDbflowObtenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDbflowObtenantRequest self = new CreateDbflowObtenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateDbflowObtenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDbflowObtenantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDbflowObtenantRequest setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public CreateDbflowObtenantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDbflowObtenantRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDbflowObtenantRequest setUids(java.util.List<Long> uids) {
        this.uids = uids;
        return this;
    }
    public java.util.List<Long> getUids() {
        return this.uids;
    }

    public CreateDbflowObtenantRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
