// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetSlsProjectnameRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_group
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static GetSlsProjectnameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSlsProjectnameRequest self = new GetSlsProjectnameRequest();
        return TeaModel.build(map, self);
    }

    public GetSlsProjectnameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSlsProjectnameRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
