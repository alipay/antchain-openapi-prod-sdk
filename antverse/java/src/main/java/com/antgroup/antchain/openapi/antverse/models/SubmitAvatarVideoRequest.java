// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class SubmitAvatarVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 视频名称
    @NameInMap("name")
    public String name;

    // 数字人id
    @NameInMap("avatar_id")
    @Validation(required = true)
    public String avatarId;

    // 说话人code
    @NameInMap("speaker_code")
    @Validation(required = true)
    public String speakerCode;

    // 播报文本（一千字以内），支持SSML
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 音量（0~100，默认50）
    @NameInMap("volume")
    public Long volume;

    // 语速（-50~50，默认 0）
    @NameInMap("speed")
    public Long speed;

    // 音调（-50~50，默认 0）
    @NameInMap("tone")
    public Long tone;

    // 背景图片Url，需要公网可访问
    @NameInMap("background_url")
    @Validation(required = true)
    public String backgroundUrl;

    // 分辨率，暂只支持1080
    @NameInMap("resolution")
    @Validation(required = true)
    public String resolution;

    // 画布比例，16:9/9:16
    @NameInMap("radio")
    @Validation(required = true)
    public String radio;

    // 数字人位置大小信息，以左上角为起始坐标，向右向下为正值
    @NameInMap("human_config")
    @Validation(required = true)
    public PositionSizeInfo humanConfig;

    public static SubmitAvatarVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAvatarVideoRequest self = new SubmitAvatarVideoRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAvatarVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAvatarVideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAvatarVideoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitAvatarVideoRequest setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public SubmitAvatarVideoRequest setSpeakerCode(String speakerCode) {
        this.speakerCode = speakerCode;
        return this;
    }
    public String getSpeakerCode() {
        return this.speakerCode;
    }

    public SubmitAvatarVideoRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SubmitAvatarVideoRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

    public SubmitAvatarVideoRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public SubmitAvatarVideoRequest setTone(Long tone) {
        this.tone = tone;
        return this;
    }
    public Long getTone() {
        return this.tone;
    }

    public SubmitAvatarVideoRequest setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
        return this;
    }
    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public SubmitAvatarVideoRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SubmitAvatarVideoRequest setRadio(String radio) {
        this.radio = radio;
        return this;
    }
    public String getRadio() {
        return this.radio;
    }

    public SubmitAvatarVideoRequest setHumanConfig(PositionSizeInfo humanConfig) {
        this.humanConfig = humanConfig;
        return this;
    }
    public PositionSizeInfo getHumanConfig() {
        return this.humanConfig;
    }

}
