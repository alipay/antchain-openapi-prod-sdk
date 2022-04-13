// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app id
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 所属应用名称。
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 必填：保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
    @NameInMap("client_token")
    public String clientToken;

    // 容器服务配置。
    // 
    @NameInMap("config")
    @Validation(required = true)
    public ContainerServiceConfig config;

    // 应用服务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 操作人账号
    @NameInMap("operator")
    public String operator;

    // 应用负责人id
    @NameInMap("owner_id")
    public String ownerId;

    // 应用负责人名称
    @NameInMap("owner_name")
    public String ownerName;

    // 工作环境组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 描述
    @NameInMap("description")
    public String description;

    public static UpdateContainerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceRequest self = new UpdateContainerserviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateContainerserviceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateContainerserviceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateContainerserviceRequest setConfig(ContainerServiceConfig config) {
        this.config = config;
        return this;
    }
    public ContainerServiceConfig getConfig() {
        return this.config;
    }

    public UpdateContainerserviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerserviceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateContainerserviceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateContainerserviceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public UpdateContainerserviceRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public UpdateContainerserviceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateContainerserviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
