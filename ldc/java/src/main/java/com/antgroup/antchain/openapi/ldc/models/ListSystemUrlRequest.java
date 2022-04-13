// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListSystemUrlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspaceGroup name
    @NameInMap("workspace_group")
    public String workspaceGroup;

    public static ListSystemUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSystemUrlRequest self = new ListSystemUrlRequest();
        return TeaModel.build(map, self);
    }

    public ListSystemUrlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSystemUrlRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
