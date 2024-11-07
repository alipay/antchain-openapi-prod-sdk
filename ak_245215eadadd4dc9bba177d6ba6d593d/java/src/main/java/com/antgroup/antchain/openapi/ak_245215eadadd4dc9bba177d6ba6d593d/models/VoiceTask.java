// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class VoiceTask extends TeaModel {
    // RUNNING, COMPLETE,FAIL
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 音频地址
    @NameInMap("audio_url")
    @Validation(required = true)
    public String audioUrl;

    // 音频时长
    @NameInMap("audio_time")
    @Validation(required = true)
    public Long audioTime;

    // 字幕信息
    @NameInMap("captions_info")
    public CaptionsInfo captionsInfo;

    public static VoiceTask build(java.util.Map<String, ?> map) throws Exception {
        VoiceTask self = new VoiceTask();
        return TeaModel.build(map, self);
    }

    public VoiceTask setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public VoiceTask setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public VoiceTask setAudioTime(Long audioTime) {
        this.audioTime = audioTime;
        return this;
    }
    public Long getAudioTime() {
        return this.audioTime;
    }

    public VoiceTask setCaptionsInfo(CaptionsInfo captionsInfo) {
        this.captionsInfo = captionsInfo;
        return this;
    }
    public CaptionsInfo getCaptionsInfo() {
        return this.captionsInfo;
    }

}
