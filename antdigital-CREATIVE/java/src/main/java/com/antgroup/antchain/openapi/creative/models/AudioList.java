// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class AudioList extends TeaModel {
    // 音频 URL 列表
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/123">www.test.com/123</a></p>
     */
    @NameInMap("audio_url")
    public String audioUrl;

    // 音频格式
    /**
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("audio_format")
    public String audioFormat;

    // 处理后播放时长（秒）
    /**
     * <strong>example:</strong>
     * <p>10.6</p>
     */
    @NameInMap("duration_seconds")
    public String durationSeconds;

    public static AudioList build(java.util.Map<String, ?> map) throws Exception {
        AudioList self = new AudioList();
        return TeaModel.build(map, self);
    }

    public AudioList setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public AudioList setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public AudioList setDurationSeconds(String durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public String getDurationSeconds() {
        return this.durationSeconds;
    }

}
