// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RiskAssessData extends TeaModel {
    // 响应头
    @NameInMap("head")
    @Validation(required = true)
    public ResponseHead head;

    // 风险评估结果
    @NameInMap("risk_result")
    @Validation(required = true)
    public RiskAssessResult riskResult;

    public static RiskAssessData build(java.util.Map<String, ?> map) throws Exception {
        RiskAssessData self = new RiskAssessData();
        return TeaModel.build(map, self);
    }

    public RiskAssessData setHead(ResponseHead head) {
        this.head = head;
        return this;
    }
    public ResponseHead getHead() {
        return this.head;
    }

    public RiskAssessData setRiskResult(RiskAssessResult riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public RiskAssessResult getRiskResult() {
        return this.riskResult;
    }

}
