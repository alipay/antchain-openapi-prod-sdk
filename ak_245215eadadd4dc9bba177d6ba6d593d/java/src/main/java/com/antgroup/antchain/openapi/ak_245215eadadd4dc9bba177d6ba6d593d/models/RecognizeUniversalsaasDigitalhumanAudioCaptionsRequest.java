// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_245215eadadd4dc9bba177d6ba6d593d.models;

import com.aliyun.tea.*;

public class RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文案
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 音频url
    @NameInMap("audio_url")
    @Validation(required = true)
    public String audioUrl;

    // 字幕拆分字数，默认为单句不拆分。
    @NameInMap("split_words")
    public Long splitWords;

    public static RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest self = new RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public RecognizeUniversalsaasDigitalhumanAudioCaptionsRequest setSplitWords(Long splitWords) {
        this.splitWords = splitWords;
        return this;
    }
    public Long getSplitWords() {
        return this.splitWords;
    }

}
