// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class RiskAssessResult extends TeaModel {
    // 风险评估结果
    @NameInMap("risk_value")
    @Validation(required = true)
    public String riskValue;

    // 风险评估分数
    @NameInMap("risk_score")
    @Validation(required = true)
    public String riskScore;

    // 风险评估标签
    @NameInMap("model_infos")
    @Validation(required = true)
    public RiskModel modelInfos;

    public static RiskAssessResult build(java.util.Map<String, ?> map) throws Exception {
        RiskAssessResult self = new RiskAssessResult();
        return TeaModel.build(map, self);
    }

    public RiskAssessResult setRiskValue(String riskValue) {
        this.riskValue = riskValue;
        return this;
    }
    public String getRiskValue() {
        return this.riskValue;
    }

    public RiskAssessResult setRiskScore(String riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public String getRiskScore() {
        return this.riskScore;
    }

    public RiskAssessResult setModelInfos(RiskModel modelInfos) {
        this.modelInfos = modelInfos;
        return this;
    }
    public RiskModel getModelInfos() {
        return this.modelInfos;
    }

}
