// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreatePlanAdvancedRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // plan
    @NameInMap("ops_plan")
    @Validation(required = true)
    public String opsPlan;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static CreatePlanAdvancedRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanAdvancedRequest self = new CreatePlanAdvancedRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlanAdvancedRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreatePlanAdvancedRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreatePlanAdvancedRequest setOpsPlan(String opsPlan) {
        this.opsPlan = opsPlan;
        return this;
    }
    public String getOpsPlan() {
        return this.opsPlan;
    }

    public CreatePlanAdvancedRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
