// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class UpdateRiskSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 风险解决方案ID
    @NameInMap("risk_solution_id")
    @Validation(required = true)
    public String riskSolutionId;

    // 解决方案类型
    @NameInMap("fix_type")
    public String fixType;

    // 风险描述
    @NameInMap("risk_description")
    public String riskDescription;

    // 风险解决方案
    @NameInMap("solution_plan")
    public String solutionPlan;

    // 应急解决方案
    @NameInMap("emergency_plan")
    public String emergencyPlan;

    public static UpdateRiskSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskSolutionRequest self = new UpdateRiskSolutionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRiskSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateRiskSolutionRequest setRiskSolutionId(String riskSolutionId) {
        this.riskSolutionId = riskSolutionId;
        return this;
    }
    public String getRiskSolutionId() {
        return this.riskSolutionId;
    }

    public UpdateRiskSolutionRequest setFixType(String fixType) {
        this.fixType = fixType;
        return this;
    }
    public String getFixType() {
        return this.fixType;
    }

    public UpdateRiskSolutionRequest setRiskDescription(String riskDescription) {
        this.riskDescription = riskDescription;
        return this;
    }
    public String getRiskDescription() {
        return this.riskDescription;
    }

    public UpdateRiskSolutionRequest setSolutionPlan(String solutionPlan) {
        this.solutionPlan = solutionPlan;
        return this;
    }
    public String getSolutionPlan() {
        return this.solutionPlan;
    }

    public UpdateRiskSolutionRequest setEmergencyPlan(String emergencyPlan) {
        this.emergencyPlan = emergencyPlan;
        return this;
    }
    public String getEmergencyPlan() {
        return this.emergencyPlan;
    }

}
