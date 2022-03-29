// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqNamespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // instance_type
    @NameInMap("instance_type")
    public String instanceType;

    // nsid
    @NameInMap("namespace_id")
    @Validation(required = true)
    public String namespaceId;

    // namespace_name
    @NameInMap("namespace_name")
    @Validation(required = true)
    public String namespaceName;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    // workspace_group
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // ldcMode
    @NameInMap("ldc_mode")
    @Validation(required = true)
    public Long ldcMode;

    public static CreateSofamqNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqNamespaceRequest self = new CreateSofamqNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqNamespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqNamespaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqNamespaceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqNamespaceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateSofamqNamespaceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateSofamqNamespaceRequest setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public CreateSofamqNamespaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateSofamqNamespaceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateSofamqNamespaceRequest setLdcMode(Long ldcMode) {
        this.ldcMode = ldcMode;
        return this;
    }
    public Long getLdcMode() {
        return this.ldcMode;
    }

}
