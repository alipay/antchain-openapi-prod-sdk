// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RiskResult extends TeaModel {
    // 数据列表
    @NameInMap("risk_data")
    @Validation(required = true)
    public java.util.List<RiskData> riskData;

    // 解决方案编码
    /**
     * <strong>example:</strong>
     * <p>·</p>
     */
    @NameInMap("solution_code")
    @Validation(required = true)
    public String solutionCode;

    public static RiskResult build(java.util.Map<String, ?> map) throws Exception {
        RiskResult self = new RiskResult();
        return TeaModel.build(map, self);
    }

    public RiskResult setRiskData(java.util.List<RiskData> riskData) {
        this.riskData = riskData;
        return this;
    }
    public java.util.List<RiskData> getRiskData() {
        return this.riskData;
    }

    public RiskResult setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
        return this;
    }
    public String getSolutionCode() {
        return this.solutionCode;
    }

}
