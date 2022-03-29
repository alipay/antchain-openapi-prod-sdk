// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SetAgentVersionstrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间名称
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 0 容器，1经典
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // TENANT、WORKSPACE
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // agent 地址，容器为镜像地址，经典为 OSS 地址
    @NameInMap("agent_url")
    @Validation(required = true)
    public String agentUrl;

    // 版本号
    @NameInMap("agent_version")
    @Validation(required = true)
    public String agentVersion;

    public static SetAgentVersionstrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAgentVersionstrategyRequest self = new SetAgentVersionstrategyRequest();
        return TeaModel.build(map, self);
    }

    public SetAgentVersionstrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetAgentVersionstrategyRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public SetAgentVersionstrategyRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public SetAgentVersionstrategyRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SetAgentVersionstrategyRequest setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
        return this;
    }
    public String getAgentUrl() {
        return this.agentUrl;
    }

    public SetAgentVersionstrategyRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

}
