// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteXdashboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 其中uuid和type必填
    @NameInMap("data")
    @Validation(required = true)
    public XResource data;

    public static DeleteXdashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteXdashboardRequest self = new DeleteXdashboardRequest();
        return TeaModel.build(map, self);
    }

    public DeleteXdashboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteXdashboardRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public DeleteXdashboardRequest setData(XResource data) {
        this.data = data;
        return this;
    }
    public XResource getData() {
        return this.data;
    }

}
