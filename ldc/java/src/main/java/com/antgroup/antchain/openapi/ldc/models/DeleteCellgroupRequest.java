// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteCellgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属环境名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 逻辑单元名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

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

    public DeleteCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
