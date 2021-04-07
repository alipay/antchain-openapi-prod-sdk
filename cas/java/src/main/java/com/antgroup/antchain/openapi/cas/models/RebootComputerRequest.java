// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RebootComputerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    // 后续必填
    @NameInMap("workspace_id")
    public String workspaceId;

    public static RebootComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootComputerRequest self = new RebootComputerRequest();
        return TeaModel.build(map, self);
    }

    public RebootComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RebootComputerRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public RebootComputerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
