// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CloneUniversalsaasDigitalhumanAvatarVoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 训练音频url
    @NameInMap("voice_url")
    @Validation(required = true)
    public String voiceUrl;

    // 音频名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static CloneUniversalsaasDigitalhumanAvatarVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneUniversalsaasDigitalhumanAvatarVoiceRequest self = new CloneUniversalsaasDigitalhumanAvatarVoiceRequest();
        return TeaModel.build(map, self);
    }

    public CloneUniversalsaasDigitalhumanAvatarVoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloneUniversalsaasDigitalhumanAvatarVoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloneUniversalsaasDigitalhumanAvatarVoiceRequest setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
        return this;
    }
    public String getVoiceUrl() {
        return this.voiceUrl;
    }

    public CloneUniversalsaasDigitalhumanAvatarVoiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
