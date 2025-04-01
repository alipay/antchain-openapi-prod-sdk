// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class PreviewUniversalsaasDigitalhumanVoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 2d---2d音色
    // 3d---3d音色
    @NameInMap("classification")
    @Validation(required = true)
    public String classification;

    // 音色编码
    @NameInMap("voice_code")
    @Validation(required = true)
    public String voiceCode;

    // 试听文案
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 语速
    @NameInMap("speed")
    public Long speed;

    // 音调
    @NameInMap("pitch")
    public Long pitch;

    // 音量
    @NameInMap("volume")
    public Long volume;

    // 数字人角色id
    @NameInMap("human_id")
    public Long humanId;

    // 数字人形象id
    @NameInMap("model_id")
    public Long modelId;

    public static PreviewUniversalsaasDigitalhumanVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewUniversalsaasDigitalhumanVoiceRequest self = new PreviewUniversalsaasDigitalhumanVoiceRequest();
        return TeaModel.build(map, self);
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setPitch(Long pitch) {
        this.pitch = pitch;
        return this;
    }
    public Long getPitch() {
        return this.pitch;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setHumanId(Long humanId) {
        this.humanId = humanId;
        return this;
    }
    public Long getHumanId() {
        return this.humanId;
    }

    public PreviewUniversalsaasDigitalhumanVoiceRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

}
