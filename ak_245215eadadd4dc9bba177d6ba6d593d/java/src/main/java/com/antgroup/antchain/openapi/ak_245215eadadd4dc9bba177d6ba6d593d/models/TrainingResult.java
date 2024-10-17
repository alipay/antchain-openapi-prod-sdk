// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class TrainingResult extends TeaModel {
    // 数字人id
    @NameInMap("model_id")
    public String modelId;

    // 音色id
    @NameInMap("voice_id")
    public String voiceId;

    public static TrainingResult build(java.util.Map<String, ?> map) throws Exception {
        TrainingResult self = new TrainingResult();
        return TeaModel.build(map, self);
    }

    public TrainingResult setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public TrainingResult setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

}
