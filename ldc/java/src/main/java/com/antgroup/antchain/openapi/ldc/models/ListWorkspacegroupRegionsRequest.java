// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListWorkspacegroupRegionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace group 名称
    // 
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static ListWorkspacegroupRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacegroupRegionsRequest self = new ListWorkspacegroupRegionsRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacegroupRegionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListWorkspacegroupRegionsRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
