// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ConfirmMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组id
    @NameInMap("id")
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static ConfirmMachinegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmMachinegroupRequest self = new ConfirmMachinegroupRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmMachinegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmMachinegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfirmMachinegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
