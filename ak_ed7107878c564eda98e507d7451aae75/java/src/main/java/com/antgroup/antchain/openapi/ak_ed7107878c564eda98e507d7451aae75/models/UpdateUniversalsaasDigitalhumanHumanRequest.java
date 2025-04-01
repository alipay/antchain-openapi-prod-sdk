// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class UpdateUniversalsaasDigitalhumanHumanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 数字人形象id
    @NameInMap("model_id")
    @Validation(required = true)
    public Long modelId;

    // 音色编码
    @NameInMap("voice_code")
    @Validation(required = true)
    public String voiceCode;

    // 数字人角色名
    @NameInMap("human_name")
    public String humanName;

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

    public static UpdateUniversalsaasDigitalhumanHumanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUniversalsaasDigitalhumanHumanRequest self = new UpdateUniversalsaasDigitalhumanHumanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setVoiceCode(String voiceCode) {
        this.voiceCode = voiceCode;
        return this;
    }
    public String getVoiceCode() {
        return this.voiceCode;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setHumanName(String humanName) {
        this.humanName = humanName;
        return this;
    }
    public String getHumanName() {
        return this.humanName;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setSpeed(Long speed) {
        this.speed = speed;
        return this;
    }
    public Long getSpeed() {
        return this.speed;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setPitch(Long pitch) {
        this.pitch = pitch;
        return this;
    }
    public Long getPitch() {
        return this.pitch;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

    public UpdateUniversalsaasDigitalhumanHumanRequest setHumanId(Long humanId) {
        this.humanId = humanId;
        return this;
    }
    public Long getHumanId() {
        return this.humanId;
    }

}
