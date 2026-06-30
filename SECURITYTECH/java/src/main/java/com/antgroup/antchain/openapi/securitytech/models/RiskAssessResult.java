// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RiskAssessResult extends TeaModel {
    // 风险评估结果
    /**
     * <strong>example:</strong>
     * <p>中风险</p>
     */
    @NameInMap("risk_value")
    @Validation(required = true)
    public String riskValue;

    // 风险评估分数
    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
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
