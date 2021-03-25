// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetMachinegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 分组 ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 是否带上机器信息，默认 false
    @NameInMap("with_machines")
    public Boolean withMachines;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
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

    public GetMachinegroupRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
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
