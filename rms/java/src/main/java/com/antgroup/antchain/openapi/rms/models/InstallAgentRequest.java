// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class InstallAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 需要安装 agent 的目标列表
    @NameInMap("collect_ids")
    public java.util.List<String> collectIds;

    // 0 容器，1经典
    @NameInMap("type")
    public Long type;

    public static InstallAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentRequest self = new InstallAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InstallAgentRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public InstallAgentRequest setCollectIds(java.util.List<String> collectIds) {
        this.collectIds = collectIds;
        return this;
    }
    public java.util.List<String> getCollectIds() {
        return this.collectIds;
    }

    public InstallAgentRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
