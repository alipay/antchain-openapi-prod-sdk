// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ExecPlanRequest extends TeaModel {
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

    // 操作人账号名
    @NameInMap("operator")
    public String operator;

    public static ExecPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecPlanRequest self = new ExecPlanRequest();
        return TeaModel.build(map, self);
    }

    public ExecPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecPlanRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ExecPlanRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public ExecPlanRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
