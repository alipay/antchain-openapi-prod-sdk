// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class CountUniversalsaasDigitalhumanVoiceNoiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 音视频文件url
    @NameInMap("media_url")
    @Validation(required = true)
    public String mediaUrl;

    public static CountUniversalsaasDigitalhumanVoiceNoiseRequest build(java.util.Map<String, ?> map) throws Exception {
        CountUniversalsaasDigitalhumanVoiceNoiseRequest self = new CountUniversalsaasDigitalhumanVoiceNoiseRequest();
        return TeaModel.build(map, self);
    }

    public CountUniversalsaasDigitalhumanVoiceNoiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountUniversalsaasDigitalhumanVoiceNoiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountUniversalsaasDigitalhumanVoiceNoiseRequest setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }
    public String getMediaUrl() {
        return this.mediaUrl;
    }

}
