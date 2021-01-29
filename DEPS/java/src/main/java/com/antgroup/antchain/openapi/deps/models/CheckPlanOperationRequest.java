// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CheckPlanOperationRequest extends TeaModel {
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

    public static CheckPlanOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPlanOperationRequest self = new CheckPlanOperationRequest();
        return TeaModel.build(map, self);
    }

    public CheckPlanOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckPlanOperationRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CheckPlanOperationRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckPlanOperationRequest setFromAliyun(Boolean fromAliyun) {
        this.fromAliyun = fromAliyun;
        return this;
    }
    public Boolean getFromAliyun() {
        return this.fromAliyun;
    }

    public CheckPlanOperationRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
