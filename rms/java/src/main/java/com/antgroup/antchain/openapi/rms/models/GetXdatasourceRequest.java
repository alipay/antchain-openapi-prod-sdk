// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetXdatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XResource data;

    public static GetXdatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetXdatasourceRequest self = new GetXdatasourceRequest();
        return TeaModel.build(map, self);
    }

    public GetXdatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetXdatasourceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetXdatasourceRequest setData(XResource data) {
        this.data = data;
        return this;
    }
    public XResource getData() {
        return this.data;
    }

}
