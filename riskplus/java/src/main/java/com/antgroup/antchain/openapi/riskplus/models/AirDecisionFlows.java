// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class AirDecisionFlows extends TeaModel {
    // 决策结果
    /**
     * <strong>example:</strong>
     * <p>review</p>
     */
    @NameInMap("decision")
    public String decision;

    // air引擎输出的infoCodes信息
    /**
     * <strong>example:</strong>
     * <p>info_codes</p>
     */
    @NameInMap("info_codes")
    public java.util.List<AirInfoCodes> infoCodes;

    // 策略名称
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    public static AirDecisionFlows build(java.util.Map<String, ?> map) throws Exception {
        AirDecisionFlows self = new AirDecisionFlows();
        return TeaModel.build(map, self);
    }

    public AirDecisionFlows setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public AirDecisionFlows setInfoCodes(java.util.List<AirInfoCodes> infoCodes) {
        this.infoCodes = infoCodes;
        return this;
    }
    public java.util.List<AirInfoCodes> getInfoCodes() {
        return this.infoCodes;
    }

    public AirDecisionFlows setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
