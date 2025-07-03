// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ModelDetails extends TeaModel {
    // 风险场景编码
    /**
     * <strong>example:</strong>
     * <p>scene_code</p>
     */
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 该风险场景的风险分值
    // 
    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    public static ModelDetails build(java.util.Map<String, ?> map) throws Exception {
        ModelDetails self = new ModelDetails();
        return TeaModel.build(map, self);
    }

    public ModelDetails setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ModelDetails setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
