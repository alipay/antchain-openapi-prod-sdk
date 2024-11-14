// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class AvatarAction extends TeaModel {
    // 动作序列id
    @NameInMap("action_id")
    @Validation(required = true)
    public Long actionId;

    // 动作时长，单位毫秒
    @NameInMap("duration")
    @Validation(required = true)
    public Long duration;

    // 动作预览链接
    @NameInMap("video_path")
    @Validation(required = true)
    public String videoPath;

    public static AvatarAction build(java.util.Map<String, ?> map) throws Exception {
        AvatarAction self = new AvatarAction();
        return TeaModel.build(map, self);
    }

    public AvatarAction setActionId(Long actionId) {
        this.actionId = actionId;
        return this;
    }
    public Long getActionId() {
        return this.actionId;
    }

    public AvatarAction setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public AvatarAction setVideoPath(String videoPath) {
        this.videoPath = videoPath;
        return this;
    }
    public String getVideoPath() {
        return this.videoPath;
    }

}
