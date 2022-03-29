// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAgentVersionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // agent 机器对应的唯一标识
    @NameInMap("collect_id")
    public String collectId;

    public static GetAgentVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentVersionRequest self = new GetAgentVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAgentVersionRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetAgentVersionRequest setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

}
