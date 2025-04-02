// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DecisionFlow extends TeaModel {
    // 输出参数
    @NameInMap("decision_flow")
    public OutParams decisionFlow;

    // 决策结果
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // infocodes
    @NameInMap("info_codes")
    public InfoCodes infoCodes;

    public static DecisionFlow build(java.util.Map<String, ?> map) throws Exception {
        DecisionFlow self = new DecisionFlow();
        return TeaModel.build(map, self);
    }

    public DecisionFlow setDecisionFlow(OutParams decisionFlow) {
        this.decisionFlow = decisionFlow;
        return this;
    }
    public OutParams getDecisionFlow() {
        return this.decisionFlow;
    }

    public DecisionFlow setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public DecisionFlow setInfoCodes(InfoCodes infoCodes) {
        this.infoCodes = infoCodes;
        return this;
    }
    public InfoCodes getInfoCodes() {
        return this.infoCodes;
    }

}
