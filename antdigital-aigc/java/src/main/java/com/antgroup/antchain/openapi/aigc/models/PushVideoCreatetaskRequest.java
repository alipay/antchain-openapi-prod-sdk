// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class PushVideoCreatetaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型标识，如 ：doubao-seedance-2-0-260128
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 文本提示词
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 图生视频参考图片 URL
    @NameInMap("image_url")
    public java.util.List<String> imageUrl;

    // 视频参考/续写时传入视频 URL
    @NameInMap("video_url")
    public java.util.List<String> videoUrl;

    // 参考音频URL列表
    @NameInMap("audio_url")
    public java.util.List<String> audioUrl;

    // 比例
    @NameInMap("ratio")
    public String ratio;

    // 视频时长（秒）
    @NameInMap("duration")
    public String duration;

    // 请求追踪 ID，用于幂等去重
    @NameInMap("request_id")
    public String requestId;

    // 扩展JSON
    @NameInMap("ext")
    public String ext;

    public static PushVideoCreatetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PushVideoCreatetaskRequest self = new PushVideoCreatetaskRequest();
        return TeaModel.build(map, self);
    }

    public PushVideoCreatetaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushVideoCreatetaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushVideoCreatetaskRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public PushVideoCreatetaskRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public PushVideoCreatetaskRequest setImageUrl(java.util.List<String> imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    public PushVideoCreatetaskRequest setVideoUrl(java.util.List<String> videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public java.util.List<String> getVideoUrl() {
        return this.videoUrl;
    }

    public PushVideoCreatetaskRequest setAudioUrl(java.util.List<String> audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public java.util.List<String> getAudioUrl() {
        return this.audioUrl;
    }

    public PushVideoCreatetaskRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public PushVideoCreatetaskRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public PushVideoCreatetaskRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushVideoCreatetaskRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
