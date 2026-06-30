// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RiskQueryData extends TeaModel {
    // 风险评分
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("risk_score")
    @Validation(required = true)
    public String riskScore;

    // 风险标签
    /**
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("risk_labels")
    @Validation(required = true)
    public java.util.List<String> riskLabels;

    public static RiskQueryData build(java.util.Map<String, ?> map) throws Exception {
        RiskQueryData self = new RiskQueryData();
        return TeaModel.build(map, self);
    }

    public RiskQueryData setRiskScore(String riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public String getRiskScore() {
        return this.riskScore;
    }

    public RiskQueryData setRiskLabels(java.util.List<String> riskLabels) {
        this.riskLabels = riskLabels;
        return this;
    }
    public java.util.List<String> getRiskLabels() {
        return this.riskLabels;
    }

}
