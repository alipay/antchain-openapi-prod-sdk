// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SecurityResultInfos extends TeaModel {
    // 反欺诈风险数据服务风险建议决策
    /**
     * <strong>example:</strong>
     * <p>reject</p>
     */
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // 反欺诈风险数据服务风险分
    /**
     * <strong>example:</strong>
     * <p>100.0</p>
     */
    @NameInMap("risk_score")
    @Validation(required = true)
    public Long riskScore;

    // 反欺诈风险数据服务场景码
    /**
     * <strong>example:</strong>
     * <p>EC_TEST</p>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static SecurityResultInfos build(java.util.Map<String, ?> map) throws Exception {
        SecurityResultInfos self = new SecurityResultInfos();
        return TeaModel.build(map, self);
    }

    public SecurityResultInfos setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public SecurityResultInfos setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public SecurityResultInfos setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
