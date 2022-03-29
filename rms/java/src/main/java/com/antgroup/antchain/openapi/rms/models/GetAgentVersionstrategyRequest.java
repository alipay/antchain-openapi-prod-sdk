// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAgentVersionstrategyRequest extends TeaModel {
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

    public static GetAgentVersionstrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentVersionstrategyRequest self = new GetAgentVersionstrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentVersionstrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAgentVersionstrategyRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetAgentVersionstrategyRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
