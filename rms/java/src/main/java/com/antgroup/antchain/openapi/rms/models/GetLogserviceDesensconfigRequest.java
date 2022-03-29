// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetLogserviceDesensconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    public static GetLogserviceDesensconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogserviceDesensconfigRequest self = new GetLogserviceDesensconfigRequest();
        return TeaModel.build(map, self);
    }

    public GetLogserviceDesensconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetLogserviceDesensconfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
