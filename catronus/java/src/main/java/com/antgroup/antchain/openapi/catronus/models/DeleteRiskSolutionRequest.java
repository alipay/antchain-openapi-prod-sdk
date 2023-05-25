// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class DeleteRiskSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险解决方案ID
    @NameInMap("risk_solution_id")
    @Validation(required = true)
    public String riskSolutionId;

    public static DeleteRiskSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRiskSolutionRequest self = new DeleteRiskSolutionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRiskSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteRiskSolutionRequest setRiskSolutionId(String riskSolutionId) {
        this.riskSolutionId = riskSolutionId;
        return this;
    }
    public String getRiskSolutionId() {
        return this.riskSolutionId;
    }

}
