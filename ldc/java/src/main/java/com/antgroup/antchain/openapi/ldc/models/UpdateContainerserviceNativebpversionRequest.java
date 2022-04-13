// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateContainerserviceNativebpversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 容器服务所在命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 云原生技术栈版本
    @NameInMap("native_build_pack_version")
    @Validation(required = true)
    public String nativeBuildPackVersion;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 环境名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 容器服务版本
    @NameInMap("revision")
    @Validation(required = true)
    public String revision;

    public static UpdateContainerserviceNativebpversionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContainerserviceNativebpversionRequest self = new UpdateContainerserviceNativebpversionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContainerserviceNativebpversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContainerserviceNativebpversionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateContainerserviceNativebpversionRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateContainerserviceNativebpversionRequest setNativeBuildPackVersion(String nativeBuildPackVersion) {
        this.nativeBuildPackVersion = nativeBuildPackVersion;
        return this;
    }
    public String getNativeBuildPackVersion() {
        return this.nativeBuildPackVersion;
    }

    public UpdateContainerserviceNativebpversionRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateContainerserviceNativebpversionRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateContainerserviceNativebpversionRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

}
