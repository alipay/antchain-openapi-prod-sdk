// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ExecXdatasourceMoveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<XResource> data;

    public static ExecXdatasourceMoveRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecXdatasourceMoveRequest self = new ExecXdatasourceMoveRequest();
        return TeaModel.build(map, self);
    }

    public ExecXdatasourceMoveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecXdatasourceMoveRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ExecXdatasourceMoveRequest setData(java.util.List<XResource> data) {
        this.data = data;
        return this;
    }
    public java.util.List<XResource> getData() {
        return this.data;
    }

}
