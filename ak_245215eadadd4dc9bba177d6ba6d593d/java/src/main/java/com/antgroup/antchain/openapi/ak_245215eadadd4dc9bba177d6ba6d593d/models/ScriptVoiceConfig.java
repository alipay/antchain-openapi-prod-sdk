// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class ScriptVoiceConfig extends TeaModel {
    // 音色id，合成驱动选择text时必填
    @NameInMap("voice_id")
    public String voiceId;

    // 话术脚本内容，合成驱动选择text时必填
    @NameInMap("text")
    public String text;

    // 0.5～2，语速，合成驱动选择text时必填
    @NameInMap("speed")
    public Long speed;

    // 音频URL，合成驱动选择audio时必填
    @NameInMap("audio_url")
    public String audioUrl;

    public static ScriptVoiceConfig build(java.util.Map<String, ?> map) throws Exception {
        ScriptVoiceConfig self = new ScriptVoiceConfig();
        return TeaModel.build(map, self);
    }

    public ScriptVoiceConfig setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public ScriptVoiceConfig setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ScriptVoiceConfig setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public ScriptVoiceConfig setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

}
