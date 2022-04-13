// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ConfirmOpsplanServicerollbackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务发布id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static ConfirmOpsplanServicerollbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmOpsplanServicerollbackRequest self = new ConfirmOpsplanServicerollbackRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmOpsplanServicerollbackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmOpsplanServicerollbackRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfirmOpsplanServicerollbackRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
