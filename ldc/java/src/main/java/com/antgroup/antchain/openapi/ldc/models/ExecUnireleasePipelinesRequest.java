// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExecUnireleasePipelinesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 解决方案ID
    @NameInMap("solution_id")
    @Validation(required = true)
    public String solutionId;

    // 租户/机构名称列表，不填默认当前机构所有租户
    @NameInMap("tenants")
    public java.util.List<String> tenants;

    public static ExecUnireleasePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecUnireleasePipelinesRequest self = new ExecUnireleasePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ExecUnireleasePipelinesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecUnireleasePipelinesRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public ExecUnireleasePipelinesRequest setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

}
