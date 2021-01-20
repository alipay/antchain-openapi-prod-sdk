// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 分组 ID
    @NameInMap("id")
    public String id;

    // 是否带上机器信息，默认 false
    @NameInMap("with_machines")
    public Boolean withMachines;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static GetMachinegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMachinegroupRequest self = new GetMachinegroupRequest();
        return TeaModel.build(map, self);
    }

    public GetMachinegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMachinegroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetMachinegroupRequest setWithMachines(Boolean withMachines) {
        this.withMachines = withMachines;
        return this;
    }
    public Boolean getWithMachines() {
        return this.withMachines;
    }

    public GetMachinegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
