// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class PushMaasAudioRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等标识，由客户端生成
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 音频模型编码
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 类型
    @NameInMap("capability_type")
    @Validation(required = true)
    public String capabilityType;

    // 音频生成提示词
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 需要朗读的文本，仅支持该参数的模型使用
    @NameInMap("text")
    public String text;

    // 音频链接，REFERENCE_TO_AUDIO 时非空
    @NameInMap("audio_urls")
    public java.util.List<String> audioUrls;

    // 图片链接，IMAGE_TO_AUDIO 时非空
    @NameInMap("image_urls")
    public java.util.List<String> imageUrls;

    // 扩展参数 JSON 字符串，内容按模型扩展参数对象组织
    @NameInMap("ext_params")
    public String extParams;

    public static PushMaasAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMaasAudioRequest self = new PushMaasAudioRequest();
        return TeaModel.build(map, self);
    }

    public PushMaasAudioRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushMaasAudioRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushMaasAudioRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMaasAudioRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushMaasAudioRequest setCapabilityType(String capabilityType) {
        this.capabilityType = capabilityType;
        return this;
    }
    public String getCapabilityType() {
        return this.capabilityType;
    }

    public PushMaasAudioRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public PushMaasAudioRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PushMaasAudioRequest setAudioUrls(java.util.List<String> audioUrls) {
        this.audioUrls = audioUrls;
        return this;
    }
    public java.util.List<String> getAudioUrls() {
        return this.audioUrls;
    }

    public PushMaasAudioRequest setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public PushMaasAudioRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

}
