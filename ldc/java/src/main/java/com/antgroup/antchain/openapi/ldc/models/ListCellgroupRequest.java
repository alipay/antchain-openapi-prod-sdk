// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListCellgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属环境名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // cell group查询前缀
    @NameInMap("name")
    public String name;

    public static ListCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCellgroupRequest self = new ListCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public ListCellgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ListCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
