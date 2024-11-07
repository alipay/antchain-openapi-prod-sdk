// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CreateUniversalsaasDigitalhumanVoiceTaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 话术脚本
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 语速，支持 0.5-2 倍速
    @NameInMap("speed")
    @Validation(required = true)
    public String speed;

    // 音调，[0.1, 3]，默认为1，通常保留一位小数即可
    @NameInMap("pitch")
    public String pitch;

    // [0.1, 3]，默认为1，通常保留一位小数即可
    @NameInMap("volume")
    public String volume;

    // 音色id
    @NameInMap("voice_id")
    @Validation(required = true)
    public String voiceId;

    // 是否返回字幕信息，默认不返回
    @NameInMap("open_caption")
    public Boolean openCaption;

    public static CreateUniversalsaasDigitalhumanVoiceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniversalsaasDigitalhumanVoiceTaskRequest self = new CreateUniversalsaasDigitalhumanVoiceTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setPitch(String pitch) {
        this.pitch = pitch;
        return this;
    }
    public String getPitch() {
        return this.pitch;
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setVoiceId(String voiceId) {
        this.voiceId = voiceId;
        return this;
    }
    public String getVoiceId() {
        return this.voiceId;
    }

    public CreateUniversalsaasDigitalhumanVoiceTaskRequest setOpenCaption(Boolean openCaption) {
        this.openCaption = openCaption;
        return this;
    }
    public Boolean getOpenCaption() {
        return this.openCaption;
    }

}
