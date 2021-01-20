// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSingleworkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 所属工作空间唯一标识
    @NameInMap("workspace")
    public String workspace;

    public static GetSingleworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSingleworkspaceRequest self = new GetSingleworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetSingleworkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSingleworkspaceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
