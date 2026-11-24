// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class ExecCreativeVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 视频描述，文生视频、图生视频均不能为空
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 参考图片，最多 5 张；不传或空数组表示文生视频
    @NameInMap("input_elements")
    public java.util.List<CreativeAssetRef> inputElements;

    // 模型标识，不传使用服务端默认模型；可用值需与上游确认
    @NameInMap("model")
    public String model;

    // STORE_VISIT_VIDEO：探店视频；PRODUCT_PROMOTION_VIDEO：带货视频
    @NameInMap("scene")
    public String scene;

    // 支持 9:16、1:1、16:9、4:3、3:4，默认 9:16
    @NameInMap("ratio")
    public String ratio;

    // 视频时长，单位秒，4～30 的整数，默认 15
    @NameInMap("duration")
    public Long duration;

    // 分辨率，支持 480、720、1080，默认 720
    @NameInMap("resolution")
    public Long resolution;

    // 是否生成音频，默认 true
    @NameInMap("generate_audio")
    public Boolean generateAudio;

    // 是否扩写脚本，默认true
    @NameInMap("expand_script")
    public Boolean expandScript;

    // 是否生成字幕，默认 true
    @NameInMap("generate_subtitle")
    public Boolean generateSubtitle;

    // 统一多模态参考素材；entity_id 与 prompt 中 @{名称,entityId} 对应。source_type 支持 MATERIAL、AFTS、URL；URL 时 path 传外部可访问的绝对 URL，与 input_elements 的外部 URL 用法一致。后端需校验 URL 并解析/转存供算法访问。与 input_elements 不可同时非空；支持图片、音频、视频及跨模态实体绑定。纯音频输入不支持，音频+视频可用。
    @NameInMap("media_refs")
    public java.util.List<CreativeVideoAssetRef> mediaRefs;

    public static ExecCreativeVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecCreativeVideoRequest self = new ExecCreativeVideoRequest();
        return TeaModel.build(map, self);
    }

    public ExecCreativeVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecCreativeVideoRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ExecCreativeVideoRequest setInputElements(java.util.List<CreativeAssetRef> inputElements) {
        this.inputElements = inputElements;
        return this;
    }
    public java.util.List<CreativeAssetRef> getInputElements() {
        return this.inputElements;
    }

    public ExecCreativeVideoRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecCreativeVideoRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExecCreativeVideoRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public ExecCreativeVideoRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public ExecCreativeVideoRequest setResolution(Long resolution) {
        this.resolution = resolution;
        return this;
    }
    public Long getResolution() {
        return this.resolution;
    }

    public ExecCreativeVideoRequest setGenerateAudio(Boolean generateAudio) {
        this.generateAudio = generateAudio;
        return this;
    }
    public Boolean getGenerateAudio() {
        return this.generateAudio;
    }

    public ExecCreativeVideoRequest setExpandScript(Boolean expandScript) {
        this.expandScript = expandScript;
        return this;
    }
    public Boolean getExpandScript() {
        return this.expandScript;
    }

    public ExecCreativeVideoRequest setGenerateSubtitle(Boolean generateSubtitle) {
        this.generateSubtitle = generateSubtitle;
        return this;
    }
    public Boolean getGenerateSubtitle() {
        return this.generateSubtitle;
    }

    public ExecCreativeVideoRequest setMediaRefs(java.util.List<CreativeVideoAssetRef> mediaRefs) {
        this.mediaRefs = mediaRefs;
        return this;
    }
    public java.util.List<CreativeVideoAssetRef> getMediaRefs() {
        return this.mediaRefs;
    }

}
