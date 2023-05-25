// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class CreateRiskSolutionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 关联风险ID
    @NameInMap("risk_id")
    @Validation(required = true)
    public String riskId;

    // 解决方案来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 修复类型
    @NameInMap("fix_type")
    @Validation(required = true)
    public String fixType;

    // 风险描述
    @NameInMap("risk_description")
    @Validation(required = true)
    public String riskDescription;

    // 风险解决方案
    @NameInMap("solution_plan")
    @Validation(required = true)
    public String solutionPlan;

    // 应急解决方案
    @NameInMap("emergency_plan")
    @Validation(required = true)
    public String emergencyPlan;

    public static CreateRiskSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRiskSolutionRequest self = new CreateRiskSolutionRequest();
        return TeaModel.build(map, self);
    }

    public CreateRiskSolutionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRiskSolutionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRiskSolutionRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

    public CreateRiskSolutionRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateRiskSolutionRequest setFixType(String fixType) {
        this.fixType = fixType;
        return this;
    }
    public String getFixType() {
        return this.fixType;
    }

    public CreateRiskSolutionRequest setRiskDescription(String riskDescription) {
        this.riskDescription = riskDescription;
        return this;
    }
    public String getRiskDescription() {
        return this.riskDescription;
    }

    public CreateRiskSolutionRequest setSolutionPlan(String solutionPlan) {
        this.solutionPlan = solutionPlan;
        return this;
    }
    public String getSolutionPlan() {
        return this.solutionPlan;
    }

    public CreateRiskSolutionRequest setEmergencyPlan(String emergencyPlan) {
        this.emergencyPlan = emergencyPlan;
        return this;
    }
    public String getEmergencyPlan() {
        return this.emergencyPlan;
    }

}
