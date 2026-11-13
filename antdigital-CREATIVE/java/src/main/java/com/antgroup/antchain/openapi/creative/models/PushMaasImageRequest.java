// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class PushMaasImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等标识，由客户端生成
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 图片模型编码
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 类型
    @NameInMap("capability_type")
    @Validation(required = true)
    public String capabilityType;

    // 生成模式
    @NameInMap("generate_mode")
    public String generateMode;

    // 图片生成或编辑提示词
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 图片地址
    @NameInMap("image_urls")
    public java.util.List<String> imageUrls;

    // 图片尺寸
    @NameInMap("size")
    public String size;

    // 图片张数
    @NameInMap("n")
    public Long n;

    // 扩展参数 JSON 字符串
    @NameInMap("ext_params")
    public String extParams;

    public static PushMaasImageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMaasImageRequest self = new PushMaasImageRequest();
        return TeaModel.build(map, self);
    }

    public PushMaasImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushMaasImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushMaasImageRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMaasImageRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushMaasImageRequest setCapabilityType(String capabilityType) {
        this.capabilityType = capabilityType;
        return this;
    }
    public String getCapabilityType() {
        return this.capabilityType;
    }

    public PushMaasImageRequest setGenerateMode(String generateMode) {
        this.generateMode = generateMode;
        return this;
    }
    public String getGenerateMode() {
        return this.generateMode;
    }

    public PushMaasImageRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public PushMaasImageRequest setImageUrls(java.util.List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public java.util.List<String> getImageUrls() {
        return this.imageUrls;
    }

    public PushMaasImageRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public PushMaasImageRequest setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public PushMaasImageRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

}
