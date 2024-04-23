// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CreateUniversalsaasDigitalhumanVideoTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数字人id
    @NameInMap("avatar_id")
    @Validation(required = true)
    public String avatarId;

    // text/audio, 合成驱动--文本/音频
    @NameInMap("driver_type")
    @Validation(required = true)
    public String driverType;

    // 形象设置
    @NameInMap("profile_info")
    public ProfileInfo profileInfo;

    // 话术脚本语音配置
    @NameInMap("script_voice_config")
    @Validation(required = true)
    public ScriptVoiceConfig scriptVoiceConfig;

    // 是否开启字幕
    @NameInMap("open_captions")
    @Validation(required = true)
    public Boolean openCaptions;

    // 字幕配置
    @NameInMap("captions_info")
    public CaptionsInfo captionsInfo;

    // 是否替换字幕敏感词
    @NameInMap("replace_sensitive")
    public Boolean replaceSensitive;

    // 背景信息
    @NameInMap("background")
    public Background background;

    // 贴片元素信息
    @NameInMap("pasters")
    public java.util.List<Paster> pasters;

    // 数字人视频生成格式，默认不填
    @NameInMap("format")
    public String format;

    public static CreateUniversalsaasDigitalhumanVideoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniversalsaasDigitalhumanVideoTaskRequest self = new CreateUniversalsaasDigitalhumanVideoTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setDriverType(String driverType) {
        this.driverType = driverType;
        return this;
    }
    public String getDriverType() {
        return this.driverType;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setProfileInfo(ProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }
    public ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setScriptVoiceConfig(ScriptVoiceConfig scriptVoiceConfig) {
        this.scriptVoiceConfig = scriptVoiceConfig;
        return this;
    }
    public ScriptVoiceConfig getScriptVoiceConfig() {
        return this.scriptVoiceConfig;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setOpenCaptions(Boolean openCaptions) {
        this.openCaptions = openCaptions;
        return this;
    }
    public Boolean getOpenCaptions() {
        return this.openCaptions;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setCaptionsInfo(CaptionsInfo captionsInfo) {
        this.captionsInfo = captionsInfo;
        return this;
    }
    public CaptionsInfo getCaptionsInfo() {
        return this.captionsInfo;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setReplaceSensitive(Boolean replaceSensitive) {
        this.replaceSensitive = replaceSensitive;
        return this;
    }
    public Boolean getReplaceSensitive() {
        return this.replaceSensitive;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setBackground(Background background) {
        this.background = background;
        return this;
    }
    public Background getBackground() {
        return this.background;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setPasters(java.util.List<Paster> pasters) {
        this.pasters = pasters;
        return this;
    }
    public java.util.List<Paster> getPasters() {
        return this.pasters;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

}
