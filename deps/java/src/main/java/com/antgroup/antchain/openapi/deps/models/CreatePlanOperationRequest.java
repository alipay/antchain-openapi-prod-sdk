// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreatePlanOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // data
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // from_aliyun
    @NameInMap("from_aliyun")
    public Boolean fromAliyun;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreatePlanOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanOperationRequest self = new CreatePlanOperationRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlanOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatePlanOperationRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreatePlanOperationRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreatePlanOperationRequest setFromAliyun(Boolean fromAliyun) {
        this.fromAliyun = fromAliyun;
        return this;
    }
    public Boolean getFromAliyun() {
        return this.fromAliyun;
    }

    public CreatePlanOperationRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
