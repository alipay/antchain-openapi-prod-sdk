// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelMachineRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 发布机器 ID
    @NameInMap("id")
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static CancelMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelMachineRequest self = new CancelMachineRequest();
        return TeaModel.build(map, self);
    }

    public CancelMachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelMachineRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelMachineRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
