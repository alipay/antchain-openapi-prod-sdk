// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class MarketingRiskData extends TeaModel {
    // risk_level
    @NameInMap("risk_level")
    @Validation(required = true)
    public Long riskLevel;

    // sug_action
    @NameInMap("sug_action")
    @Validation(required = true)
    public String sugAction;

    // `
    @NameInMap("risk_labels")
    @Validation(required = true)
    public java.util.List<String> riskLabels;

    public static MarketingRiskData build(java.util.Map<String, ?> map) throws Exception {
        MarketingRiskData self = new MarketingRiskData();
        return TeaModel.build(map, self);
    }

    public MarketingRiskData setRiskLevel(Long riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public Long getRiskLevel() {
        return this.riskLevel;
    }

    public MarketingRiskData setSugAction(String sugAction) {
        this.sugAction = sugAction;
        return this;
    }
    public String getSugAction() {
        return this.sugAction;
    }

    public MarketingRiskData setRiskLabels(java.util.List<String> riskLabels) {
        this.riskLabels = riskLabels;
        return this;
    }
    public java.util.List<String> getRiskLabels() {
        return this.riskLabels;
    }

}
