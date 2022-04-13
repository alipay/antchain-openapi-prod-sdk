// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetCellgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属环境信息。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 逻辑单元名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static GetCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCellgroupRequest self = new GetCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public GetCellgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public GetCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
