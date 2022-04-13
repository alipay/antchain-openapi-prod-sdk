// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateContainerserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属应用名称。
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 必填，且不能重复。保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符，且不能超过64个字符。
    @NameInMap("client_token")
    public String clientToken;

    // 容器服务配置。
    @NameInMap("config")
    @Validation(required = true)
    public ContainerServiceConfig config;

    // 容器服务描述
    @NameInMap("description")
    public String description;

    // 容器服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 操作人iam账号名，通过pop调用时该参数无效。
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // owner_id（废弃）
    @NameInMap("owner_id")
    public String ownerId;

    // owner_name（废弃）
    @NameInMap("owner_name")
    public String ownerName;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 应用appid
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    public static CreateContainerserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerserviceRequest self = new CreateContainerserviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateContainerserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContainerserviceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateContainerserviceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateContainerserviceRequest setConfig(ContainerServiceConfig config) {
        this.config = config;
        return this;
    }
    public ContainerServiceConfig getConfig() {
        return this.config;
    }

    public CreateContainerserviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateContainerserviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContainerserviceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateContainerserviceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateContainerserviceRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateContainerserviceRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public CreateContainerserviceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateContainerserviceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
