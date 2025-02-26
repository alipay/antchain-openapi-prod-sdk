// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CreateUniversalsaasDigitalhumanVideoTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 画布大小
    @NameInMap("height")
    public Long height;

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
    @NameInMap("video_format")
    public String videoFormat;

    // 画布大小
    @NameInMap("width")
    public Long width;

    // 是否返回字幕时间戳，但不合成到视频画面里面
    @NameInMap("return_captions")
    public Boolean returnCaptions;

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

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
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

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setVideoFormat(String videoFormat) {
        this.videoFormat = videoFormat;
        return this;
    }
    public String getVideoFormat() {
        return this.videoFormat;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public CreateUniversalsaasDigitalhumanVideoTaskRequest setReturnCaptions(Boolean returnCaptions) {
        this.returnCaptions = returnCaptions;
        return this;
    }
    public Boolean getReturnCaptions() {
        return this.returnCaptions;
    }

}
