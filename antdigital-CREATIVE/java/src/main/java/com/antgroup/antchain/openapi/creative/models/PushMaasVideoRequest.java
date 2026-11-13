// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class PushMaasVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 幂等标识，由客户端生成
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 视频模型编码
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 类型
    @NameInMap("capability_type")
    @Validation(required = true)
    public String capabilityType;

    // 非空内容列表，至少含文本或素材
    @NameInMap("content")
    @Validation(required = true)
    public java.util.List<ContentInfo> content;

    // 视频时长（秒）
    @NameInMap("duration")
    public String duration;

    // 宽高比，如 16:9、9:16
    @NameInMap("ratio")
    public String ratio;

    // 分辨率，如 720P、1080P
    @NameInMap("resolution")
    public String resolution;

    // 是否生成音轨，默认 false
    @NameInMap("generate_audio")
    public Boolean generateAudio;

    // 是否添加水印
    @NameInMap("watermark")
    public Boolean watermark;

    // 扩展参数 JSON 字符串
    @NameInMap("ext_params")
    public String extParams;

    public static PushMaasVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMaasVideoRequest self = new PushMaasVideoRequest();
        return TeaModel.build(map, self);
    }

    public PushMaasVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushMaasVideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushMaasVideoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushMaasVideoRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushMaasVideoRequest setCapabilityType(String capabilityType) {
        this.capabilityType = capabilityType;
        return this;
    }
    public String getCapabilityType() {
        return this.capabilityType;
    }

    public PushMaasVideoRequest setContent(java.util.List<ContentInfo> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ContentInfo> getContent() {
        return this.content;
    }

    public PushMaasVideoRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public PushMaasVideoRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public PushMaasVideoRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public PushMaasVideoRequest setGenerateAudio(Boolean generateAudio) {
        this.generateAudio = generateAudio;
        return this;
    }
    public Boolean getGenerateAudio() {
        return this.generateAudio;
    }

    public PushMaasVideoRequest setWatermark(Boolean watermark) {
        this.watermark = watermark;
        return this;
    }
    public Boolean getWatermark() {
        return this.watermark;
    }

    public PushMaasVideoRequest setExtParams(String extParams) {
        this.extParams = extParams;
        return this;
    }
    public String getExtParams() {
        return this.extParams;
    }

}
