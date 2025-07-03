// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DfSceneInfos extends TeaModel {
    // scene_code
    /**
     * <strong>example:</strong>
     * <p>场景code</p>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 拒绝
    /**
     * <strong>example:</strong>
     * <p>reject</p>
     */
    @NameInMap("scene_decision")
    @Validation(required = true)
    public String sceneDecision;

    // decision_flow
    /**
     * <strong>example:</strong>
     * <p>decision_flow</p>
     */
    @NameInMap("decision_flow")
    @Validation(required = true)
    public DecisionFlow decisionFlow;

    public static DfSceneInfos build(java.util.Map<String, ?> map) throws Exception {
        DfSceneInfos self = new DfSceneInfos();
        return TeaModel.build(map, self);
    }

    public DfSceneInfos setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public DfSceneInfos setSceneDecision(String sceneDecision) {
        this.sceneDecision = sceneDecision;
        return this;
    }
    public String getSceneDecision() {
        return this.sceneDecision;
    }

    public DfSceneInfos setDecisionFlow(DecisionFlow decisionFlow) {
        this.decisionFlow = decisionFlow;
        return this;
    }
    public DecisionFlow getDecisionFlow() {
        return this.decisionFlow;
    }

}
