// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ModelResult extends TeaModel {
    // 分数
    /**
     * <strong>example:</strong>
     * <p>0.91</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public String score;

    // 模型id
    /**
     * <strong>example:</strong>
     * <p>20230701_001</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    public static ModelResult build(java.util.Map<String, ?> map) throws Exception {
        ModelResult self = new ModelResult();
        return TeaModel.build(map, self);
    }

    public ModelResult setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public ModelResult setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
