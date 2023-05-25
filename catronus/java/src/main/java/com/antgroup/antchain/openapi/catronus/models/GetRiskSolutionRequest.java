// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetRiskSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险解决方案ID, risk_id和risk_solution_id至少有一个非空
    @NameInMap("risk_solution_id")
    public String riskSolutionId;

    // 风险ID，risk_id和risk_solution_id至少有一个非空
    @NameInMap("risk_id")
    public String riskId;

    public static GetRiskSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRiskSolutionRequest self = new GetRiskSolutionRequest();
        return TeaModel.build(map, self);
    }

    public GetRiskSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRiskSolutionRequest setRiskSolutionId(String riskSolutionId) {
        this.riskSolutionId = riskSolutionId;
        return this;
    }
    public String getRiskSolutionId() {
        return this.riskSolutionId;
    }

    public GetRiskSolutionRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

}
