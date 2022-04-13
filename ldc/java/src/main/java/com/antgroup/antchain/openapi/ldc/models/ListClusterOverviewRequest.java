// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListClusterOverviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace group name
    // 
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static ListClusterOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOverviewRequest self = new ListClusterOverviewRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterOverviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListClusterOverviewRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
