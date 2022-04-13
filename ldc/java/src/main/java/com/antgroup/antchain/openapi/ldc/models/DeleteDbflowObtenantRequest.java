// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeleteDbflowObtenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 租户唯一标识
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static DeleteDbflowObtenantRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDbflowObtenantRequest self = new DeleteDbflowObtenantRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDbflowObtenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDbflowObtenantRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeleteDbflowObtenantRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
