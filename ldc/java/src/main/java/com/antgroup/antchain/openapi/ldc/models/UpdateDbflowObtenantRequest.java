// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateDbflowObtenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // OB租户唯一标识
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // OB租户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 用于存放对应的业务库租户类型：单库类型或分片库
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 租户描述
    @NameInMap("description")
    public String description;

    // 对应uid分片段，用于存放对应分片库
    @NameInMap("uids")
    public java.util.List<Long> uids;

    // 租户扩展属性，格式为序列化后的json字符串
    @NameInMap("extend_properties")
    public String extendProperties;

    public static UpdateDbflowObtenantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDbflowObtenantRequest self = new UpdateDbflowObtenantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDbflowObtenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDbflowObtenantRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateDbflowObtenantRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDbflowObtenantRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDbflowObtenantRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateDbflowObtenantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDbflowObtenantRequest setUids(java.util.List<Long> uids) {
        this.uids = uids;
        return this;
    }
    public java.util.List<Long> getUids() {
        return this.uids;
    }

    public UpdateDbflowObtenantRequest setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

}
