// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFlowCellgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static ListFlowCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowCellgroupRequest self = new ListFlowCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowCellgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListFlowCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
