// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RiskModel extends TeaModel {
    // 风险场景编码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 该风险场景的风险分值
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    public static RiskModel build(java.util.Map<String, ?> map) throws Exception {
        RiskModel self = new RiskModel();
        return TeaModel.build(map, self);
    }

    public RiskModel setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public RiskModel setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
