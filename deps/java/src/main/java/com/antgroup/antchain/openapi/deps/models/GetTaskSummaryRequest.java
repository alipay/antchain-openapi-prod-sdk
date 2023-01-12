// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetTaskSummaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static GetTaskSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskSummaryRequest self = new GetTaskSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskSummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTaskSummaryRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetTaskSummaryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetTaskSummaryRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
