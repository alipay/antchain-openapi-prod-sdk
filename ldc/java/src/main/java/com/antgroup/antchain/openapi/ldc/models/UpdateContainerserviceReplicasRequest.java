// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceReplicasRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 扩缩容replica详情
    @NameInMap("fixed_replica_elastic_config")
    @Validation(required = true)
    public FixedReplicaElasticConfig fixedReplicaElasticConfig;

    // 容器应用服务名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 操作人
    @NameInMap("operator")
    public String operator;

    // 容器应用服务版本号。
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    // 所属工作空间组名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateContainerserviceReplicasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceReplicasRequest self = new UpdateContainerserviceReplicasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceReplicasRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceReplicasRequest setFixedReplicaElasticConfig(FixedReplicaElasticConfig fixedReplicaElasticConfig) {
        this.fixedReplicaElasticConfig = fixedReplicaElasticConfig;
        return this;
    }
    public FixedReplicaElasticConfig getFixedReplicaElasticConfig() {
        return this.fixedReplicaElasticConfig;
    }

    public UpdateContainerserviceReplicasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerserviceReplicasRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateContainerserviceReplicasRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateContainerserviceReplicasRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateContainerserviceReplicasRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
