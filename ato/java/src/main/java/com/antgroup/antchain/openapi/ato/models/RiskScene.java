// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RiskScene extends TeaModel {
    // 风险场景编码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 该场景的风险决策结果
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    public static RiskScene build(java.util.Map<String, ?> map) throws Exception {
        RiskScene self = new RiskScene();
        return TeaModel.build(map, self);
    }

    public RiskScene setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public RiskScene setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

}
