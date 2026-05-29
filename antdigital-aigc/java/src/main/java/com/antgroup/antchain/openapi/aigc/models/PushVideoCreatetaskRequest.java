// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class PushVideoCreatetaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型标识，如 seedance-01-pro / happyhorse-t2v / wanx-v1
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 文本提示词
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 图生视频时传入参考图片 URL
    @NameInMap("image_url")
    public String imageUrl;

    // 视频续写时传入参考视频 URL
    @NameInMap("video_url")
    public String videoUrl;

    // 参考音频 URL（预留）
    @NameInMap("audio_url")
    public String audioUrl;

    // 参考图片 URL（参考图生视频场景）
    @NameInMap("ref_image_url")
    public String refImageUrl;

    // 分辨率，如 1280x720
    @NameInMap("size")
    public String size;

    // 视频时长（秒）
    @NameInMap("duration")
    public String duration;

    // 请求追踪 ID，用于幂等去重
    @NameInMap("request_id")
    public String requestId;

    // MIST Token / API Key
    @NameInMap("token")
    @Validation(required = true)
    public String token;

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

    public PushVideoCreatetaskRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public PushVideoCreatetaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public PushVideoCreatetaskRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public PushVideoCreatetaskRequest setRefImageUrl(String refImageUrl) {
        this.refImageUrl = refImageUrl;
        return this;
    }
    public String getRefImageUrl() {
        return this.refImageUrl;
    }

    public PushVideoCreatetaskRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
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

    public PushVideoCreatetaskRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public PushVideoCreatetaskRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

}
