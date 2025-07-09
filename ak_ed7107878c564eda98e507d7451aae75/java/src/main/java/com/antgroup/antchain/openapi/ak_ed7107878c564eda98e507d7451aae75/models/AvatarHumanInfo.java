// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AvatarHumanInfo extends TeaModel {
    // 数字人角色id
    /**
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 数字人角色名
    /**
     * <strong>example:</strong>
     * <p>小忆</p>
     */
    @NameInMap("human_name")
    @Validation(required = true)
    public String humanName;

    // 数字人形象id
    /**
     * <strong>example:</strong>
     * <p>1886</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public Long modelId;

    // 数字人音色编码
    /**
     * <strong>example:</strong>
     * <p>269</p>
     */
    @NameInMap("voice_code")
    @Validation(required = true)
    public String voiceCode;

    // 数字人音色名
    /**
     * <strong>example:</strong>
     * <p>小忆</p>
     */
    @NameInMap("voice_name")
    public String voiceName;

    // 数字人音色预览图
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.123.com">www.123.com</a></p>
     */
    @NameInMap("voice_image")
    public String voiceImage;

    // 语速
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("speech_rate")
    public Long speechRate;

    // 音调
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pitch_rate")
    public String pitchRate;

    // 音量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("volume")
    public String volume;

    public static AvatarHumanInfo build(java.util.Map<String, ?> map) throws Exception {
        AvatarHumanInfo self = new AvatarHumanInfo();
        return TeaModel.build(map, self);
    }

    public AvatarHumanInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public AvatarHumanInfo setHumanName(String humanName) {
        this.humanName = humanName;
        return this;
    }
    public String getHumanName() {
        return this.humanName;
    }

    public AvatarHumanInfo setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public AvatarHumanInfo setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public AvatarHumanInfo setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

    public AvatarHumanInfo setVoiceImage(String voiceImage) {
        this.voiceImage = voiceImage;
        return this;
    }
    public String getVoiceImage() {
        return this.voiceImage;
    }

    public AvatarHumanInfo setSpeechRate(Long speechRate) {
        this.speechRate = speechRate;
        return this;
    }
    public Long getSpeechRate() {
        return this.speechRate;
    }

    public AvatarHumanInfo setPitchRate(String pitchRate) {
        this.pitchRate = pitchRate;
        return this;
    }
    public String getPitchRate() {
        return this.pitchRate;
    }

    public AvatarHumanInfo setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

}
