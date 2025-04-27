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
    public String speed;

    // 音频URL，合成驱动选择audio时必填
    @NameInMap("audio_url")
    public String audioUrl;

    // 音量，[0.1, 3]，默认为1，通常保留一位小数即可
    @NameInMap("volume")
    public String volume;

    // 音调，[0.1, 3]，默认为1，通常保留一位小数即可
    @NameInMap("pitch")
    public String pitch;

    // 驱动类型
    @NameInMap("driver_type")
    public String driverType;

    // 情绪
    @NameInMap("emotion")
    public String emotion;

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

    public ScriptVoiceConfig setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

    public ScriptVoiceConfig setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public ScriptVoiceConfig setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

    public ScriptVoiceConfig setPitch(String pitch) {
        this.pitch = pitch;
        return this;
    }
    public String getPitch() {
        return this.pitch;
    }

    public ScriptVoiceConfig setDriverType(String driverType) {
        this.driverType = driverType;
        return this;
    }
    public String getDriverType() {
        return this.driverType;
    }

    public ScriptVoiceConfig setEmotion(String emotion) {
        this.emotion = emotion;
        return this;
    }
    public String getEmotion() {
        return this.emotion;
    }

}
