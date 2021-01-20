// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteCellgroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 逻辑单元名称
    @NameInMap("name")
    public String name;

    // 所属环境名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    public static DeleteCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCellgroupRequest self = new DeleteCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCellgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
