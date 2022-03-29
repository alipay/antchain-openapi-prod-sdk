// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteUsergroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 通知组 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static DeleteUsergroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUsergroupRequest self = new DeleteUsergroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUsergroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteUsergroupRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public DeleteUsergroupRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
