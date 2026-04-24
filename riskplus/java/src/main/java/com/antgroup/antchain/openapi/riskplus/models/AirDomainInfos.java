// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class AirDomainInfos extends TeaModel {
    // 决策域信息
    /**
     * <strong>example:</strong>
     * <p>air_domain</p>
     */
    @NameInMap("domain_code")
    public String domainCode;

    // 决策域信息
    /**
     * <strong>example:</strong>
     * <p>review</p>
     */
    @NameInMap("domain_decision")
    public String domainDecision;

    // 决策流输出
    /**
     * <strong>example:</strong>
     * <p>[{&quot;decision&quot;:&quot;review&quot;,&quot;name&quot;:&quot;租赁测试策略&quot;}]</p>
     */
    @NameInMap("decision_flows")
    public java.util.List<AirDecisionFlows> decisionFlows;

    public static AirDomainInfos build(java.util.Map<String, ?> map) throws Exception {
        AirDomainInfos self = new AirDomainInfos();
        return TeaModel.build(map, self);
    }

    public AirDomainInfos setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public AirDomainInfos setDomainDecision(String domainDecision) {
        this.domainDecision = domainDecision;
        return this;
    }
    public String getDomainDecision() {
        return this.domainDecision;
    }

    public AirDomainInfos setDecisionFlows(java.util.List<AirDecisionFlows> decisionFlows) {
        this.decisionFlows = decisionFlows;
        return this;
    }
    public java.util.List<AirDecisionFlows> getDecisionFlows() {
        return this.decisionFlows;
    }

}
