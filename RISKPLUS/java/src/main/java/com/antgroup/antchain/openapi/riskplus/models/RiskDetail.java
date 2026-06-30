// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RiskDetail extends TeaModel {
    // 反欺诈风险数据服务命中规则风险权重
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rule_weight")
    @Validation(required = true)
    public String ruleWeight;

    // 反欺诈风险数据服务命中规则名称
    /**
     * <strong>example:</strong>
     * <p>贷款车辆厂商指导价与实际不符</p>
     */
    @NameInMap("rule_name")
    @Validation(required = true)
    public String ruleName;

    public static RiskDetail build(java.util.Map<String, ?> map) throws Exception {
        RiskDetail self = new RiskDetail();
        return TeaModel.build(map, self);
    }

    public RiskDetail setRuleWeight(String ruleWeight) {
        this.ruleWeight = ruleWeight;
        return this;
    }
    public String getRuleWeight() {
        return this.ruleWeight;
    }

    public RiskDetail setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
