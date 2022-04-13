// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单元名称前缀
    @NameInMap("name")
    public String name;

    // 环境名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static ListCellRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCellRequest self = new ListCellRequest();
        return TeaModel.build(map, self);
    }

    public ListCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
