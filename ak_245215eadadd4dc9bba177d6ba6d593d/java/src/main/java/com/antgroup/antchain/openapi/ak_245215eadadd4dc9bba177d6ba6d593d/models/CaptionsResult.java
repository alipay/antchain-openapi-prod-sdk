// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CaptionsResult extends TeaModel {
    // 音频时长
    @NameInMap("duration")
    @Validation(required = true)
    public Long duration;

    // 字幕时间戳信息
    @NameInMap("sentences")
    @Validation(required = true)
    public java.util.List<Sentence> sentences;

    public static CaptionsResult build(java.util.Map<String, ?> map) throws Exception {
        CaptionsResult self = new CaptionsResult();
        return TeaModel.build(map, self);
    }

    public CaptionsResult setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public CaptionsResult setSentences(java.util.List<Sentence> sentences) {
        this.sentences = sentences;
        return this;
    }
    public java.util.List<Sentence> getSentences() {
        return this.sentences;
    }

}
