// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeVideoRequest extends TeaModel {
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

    public static ExecAntcloudMarketingagentCreativeVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeVideoRequest self = new ExecAntcloudMarketingagentCreativeVideoRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setInputElements(java.util.List<CreativeAssetRef> inputElements) {
        this.inputElements = inputElements;
        return this;
    }
    public java.util.List<CreativeAssetRef> getInputElements() {
        return this.inputElements;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setResolution(Long resolution) {
        this.resolution = resolution;
        return this;
    }
    public Long getResolution() {
        return this.resolution;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setGenerateAudio(Boolean generateAudio) {
        this.generateAudio = generateAudio;
        return this;
    }
    public Boolean getGenerateAudio() {
        return this.generateAudio;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setExpandScript(Boolean expandScript) {
        this.expandScript = expandScript;
        return this;
    }
    public Boolean getExpandScript() {
        return this.expandScript;
    }

    public ExecAntcloudMarketingagentCreativeVideoRequest setGenerateSubtitle(Boolean generateSubtitle) {
        this.generateSubtitle = generateSubtitle;
        return this;
    }
    public Boolean getGenerateSubtitle() {
        return this.generateSubtitle;
    }

}
