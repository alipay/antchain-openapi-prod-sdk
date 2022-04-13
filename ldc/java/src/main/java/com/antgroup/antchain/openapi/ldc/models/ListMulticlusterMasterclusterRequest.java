// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListMulticlusterMasterclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace group name
    @NameInMap("workspace_group")
    public String workspaceGroup;

    public static ListMulticlusterMasterclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMulticlusterMasterclusterRequest self = new ListMulticlusterMasterclusterRequest();
        return TeaModel.build(map, self);
    }

    public ListMulticlusterMasterclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListMulticlusterMasterclusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
