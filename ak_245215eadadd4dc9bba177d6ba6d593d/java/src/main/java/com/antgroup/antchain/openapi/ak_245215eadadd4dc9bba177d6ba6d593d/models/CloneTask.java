// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CloneTask extends TeaModel {
    // 数字人id
    @NameInMap("model_id")
    public String modelId;

    // 音色id
    @NameInMap("voice_id")
    public String voiceId;

    // 初始化/训练队列中/声音克隆中/声音克隆完成/形象克隆中/形象克隆完成
    @NameInMap("avatar_status")
    public String avatarStatus;

    public static CloneTask build(java.util.Map<String, ?> map) throws Exception {
        CloneTask self = new CloneTask();
        return TeaModel.build(map, self);
    }

    public CloneTask setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CloneTask setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public CloneTask setAvatarStatus(String avatarStatus) {
        this.avatarStatus = avatarStatus;
        return this;
    }
    public String getAvatarStatus() {
        return this.avatarStatus;
    }

}
