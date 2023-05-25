// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class RiskSolution extends TeaModel {
    // 风险解决方案ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 风险名称
    @NameInMap("risk_name")
    @Validation(required = true)
    public String riskName;

    // 来源
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

    // 负责人
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    public static RiskSolution build(java.util.Map<String, ?> map) throws Exception {
        RiskSolution self = new RiskSolution();
        return TeaModel.build(map, self);
    }

    public RiskSolution setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RiskSolution setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RiskSolution setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

    public RiskSolution setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public RiskSolution setFixType(String fixType) {
        this.fixType = fixType;
        return this;
    }
    public String getFixType() {
        return this.fixType;
    }

    public RiskSolution setRiskDescription(String riskDescription) {
        this.riskDescription = riskDescription;
        return this;
    }
    public String getRiskDescription() {
        return this.riskDescription;
    }

    public RiskSolution setSolutionPlan(String solutionPlan) {
        this.solutionPlan = solutionPlan;
        return this;
    }
    public String getSolutionPlan() {
        return this.solutionPlan;
    }

    public RiskSolution setEmergencyPlan(String emergencyPlan) {
        this.emergencyPlan = emergencyPlan;
        return this;
    }
    public String getEmergencyPlan() {
        return this.emergencyPlan;
    }

    public RiskSolution setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
