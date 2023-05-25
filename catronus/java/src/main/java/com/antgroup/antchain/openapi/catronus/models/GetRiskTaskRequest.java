// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetRiskTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险工单ID
    @NameInMap("risk_task_id")
    @Validation(required = true)
    public String riskTaskId;

    public static GetRiskTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskTaskRequest self = new GetRiskTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRiskTaskRequest setRiskTaskId(String riskTaskId) {
        this.riskTaskId = riskTaskId;
        return this;
    }
    public String getRiskTaskId() {
        return this.riskTaskId;
    }

}
