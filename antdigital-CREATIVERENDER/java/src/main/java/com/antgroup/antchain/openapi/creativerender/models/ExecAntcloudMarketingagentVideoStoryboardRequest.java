// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentVideoStoryboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 拆解要求
    @NameInMap("prompt")
    @Validation(required = true)
    public String prompt;

    // 模型
    @NameInMap("video_model")
    public String videoModel;

    // 画幅
    @NameInMap("ratio")
    public String ratio;

    // 分辨率
    @NameInMap("resolution")
    public Long resolution;

    // 替换图片（可空）
    @NameInMap("media_refs")
    @Validation(required = true)
    public java.util.List<CreativeVideoAssetRef> mediaRefs;

    // 会话ID
    @NameInMap("session_id")
    public String sessionId;

    // 原视频
    @NameInMap("origin_video")
    @Validation(required = true)
    public CreativeVideoAssetRef originVideo;

    public static ExecAntcloudMarketingagentVideoStoryboardRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentVideoStoryboardRequest self = new ExecAntcloudMarketingagentVideoStoryboardRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setVideoModel(String videoModel) {
        this.videoModel = videoModel;
        return this;
    }
    public String getVideoModel() {
        return this.videoModel;
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setResolution(Long resolution) {
        this.resolution = resolution;
        return this;
    }
    public Long getResolution() {
        return this.resolution;
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setMediaRefs(java.util.List<CreativeVideoAssetRef> mediaRefs) {
        this.mediaRefs = mediaRefs;
        return this;
    }
    public java.util.List<CreativeVideoAssetRef> getMediaRefs() {
        return this.mediaRefs;
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ExecAntcloudMarketingagentVideoStoryboardRequest setOriginVideo(CreativeVideoAssetRef originVideo) {
        this.originVideo = originVideo;
        return this;
    }
    public CreativeVideoAssetRef getOriginVideo() {
        return this.originVideo;
    }

}
