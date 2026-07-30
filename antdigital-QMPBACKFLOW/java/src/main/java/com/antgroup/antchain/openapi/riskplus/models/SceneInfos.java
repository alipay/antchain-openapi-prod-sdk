// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SceneInfos extends TeaModel {
    // 决策结果
    /**
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("decision")
    @Validation(required = true)
    public String decision;

    // 场景code
    /**
     * <strong>example:</strong>
     * <p>ANFAPP</p>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static SceneInfos build(java.util.Map<String, ?> map) throws Exception {
        SceneInfos self = new SceneInfos();
        return TeaModel.build(map, self);
    }

    public SceneInfos setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public SceneInfos setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
