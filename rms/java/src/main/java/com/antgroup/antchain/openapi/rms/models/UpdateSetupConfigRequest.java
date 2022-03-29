// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateSetupConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    public String workspaceName;

    //  
    @NameInMap("data")
    @Validation(required = true)
    public XKeyJson data;

    public static UpdateSetupConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSetupConfigRequest self = new UpdateSetupConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSetupConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSetupConfigRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateSetupConfigRequest setData(XKeyJson data) {
        this.data = data;
        return this;
    }
    public XKeyJson getData() {
        return this.data;
    }

}
