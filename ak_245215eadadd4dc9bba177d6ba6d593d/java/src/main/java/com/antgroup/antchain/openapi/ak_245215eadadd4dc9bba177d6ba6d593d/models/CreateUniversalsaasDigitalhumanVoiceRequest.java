// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CreateUniversalsaasDigitalhumanVoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要转语音的文字
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 语速，[0.5,2.0]，默认1.0
    @NameInMap("speed")
    public String speed;

    // 音调，[0.1,3.0]，默认1.0
    @NameInMap("pitch")
    public String pitch;

    // 音量，[0.1,3.0]，默认1.0
    @NameInMap("volume")
    public String volume;

    // 音色id
    @NameInMap("voice")
    @Validation(required = true)
    public String voice;

    public static CreateUniversalsaasDigitalhumanVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniversalsaasDigitalhumanVoiceRequest self = new CreateUniversalsaasDigitalhumanVoiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniversalsaasDigitalhumanVoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUniversalsaasDigitalhumanVoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUniversalsaasDigitalhumanVoiceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public CreateUniversalsaasDigitalhumanVoiceRequest setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

    public CreateUniversalsaasDigitalhumanVoiceRequest setPitch(String pitch) {
        this.pitch = pitch;
        return this;
    }
    public String getPitch() {
        return this.pitch;
    }

    public CreateUniversalsaasDigitalhumanVoiceRequest setVolume(String volume) {
        this.volume = volume;
        return this;
    }
    public String getVolume() {
        return this.volume;
    }

    public CreateUniversalsaasDigitalhumanVoiceRequest setVoice(String voice) {
        this.voice = voice;
        return this;
    }
    public String getVoice() {
        return this.voice;
    }

}
