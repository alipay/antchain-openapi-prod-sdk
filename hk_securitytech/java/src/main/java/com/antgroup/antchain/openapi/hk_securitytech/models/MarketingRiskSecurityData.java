// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class MarketingRiskSecurityData extends TeaModel {
    // apdid_token
    @NameInMap("apdid_token")
    @Validation(required = true)
    public String apdidToken;

    // signature
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // solution_risk_code
    @NameInMap("solution_risk_code")
    @Validation(required = true)
    public String solutionRiskCode;

    public static MarketingRiskSecurityData build(java.util.Map<String, ?> map) throws Exception {
        MarketingRiskSecurityData self = new MarketingRiskSecurityData();
        return TeaModel.build(map, self);
    }

    public MarketingRiskSecurityData setApdidToken(String apdidToken) {
        this.apdidToken = apdidToken;
        return this;
    }
    public String getApdidToken() {
        return this.apdidToken;
    }

    public MarketingRiskSecurityData setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public MarketingRiskSecurityData setSolutionRiskCode(String solutionRiskCode) {
        this.solutionRiskCode = solutionRiskCode;
        return this;
    }
    public String getSolutionRiskCode() {
        return this.solutionRiskCode;
    }

}
