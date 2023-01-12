// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CancelPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // reason
    @NameInMap("reason")
    public String reason;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 操作人账号
    @NameInMap("operator")
    public String operator;

    public static CancelPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPlanRequest self = new CancelPlanRequest();
        return TeaModel.build(map, self);
    }

    public CancelPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelPlanRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CancelPlanRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CancelPlanRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CancelPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CancelPlanRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
