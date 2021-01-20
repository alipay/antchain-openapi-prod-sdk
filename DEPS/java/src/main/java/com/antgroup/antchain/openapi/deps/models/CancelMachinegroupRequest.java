// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组 ID
    @NameInMap("id")
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CancelMachinegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMachinegroupRequest self = new CancelMachinegroupRequest();
        return TeaModel.build(map, self);
    }

    public CancelMachinegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelMachinegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelMachinegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
