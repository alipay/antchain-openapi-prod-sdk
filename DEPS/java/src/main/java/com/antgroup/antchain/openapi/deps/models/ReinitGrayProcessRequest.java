// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ReinitGrayProcessRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // ID
    @NameInMap("id")
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static ReinitGrayProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitGrayProcessRequest self = new ReinitGrayProcessRequest();
        return TeaModel.build(map, self);
    }

    public ReinitGrayProcessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitGrayProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ReinitGrayProcessRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
