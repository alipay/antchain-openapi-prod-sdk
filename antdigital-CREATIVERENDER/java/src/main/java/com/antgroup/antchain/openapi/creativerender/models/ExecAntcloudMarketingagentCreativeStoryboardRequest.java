// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeStoryboardRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // string
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

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

    // 原视频+替换图片
    @NameInMap("media_refs")
    @Validation(required = true)
    public CreativeAssetRef mediaRefs;

    // 会话ID
    @NameInMap("session_id")
    public String sessionId;

    // 画布ID
    @NameInMap("canvas_id")
    public String canvasId;

    public static ExecAntcloudMarketingagentCreativeStoryboardRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeStoryboardRequest self = new ExecAntcloudMarketingagentCreativeStoryboardRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setVideoModel(String videoModel) {
        this.videoModel = videoModel;
        return this;
    }
    public String getVideoModel() {
        return this.videoModel;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setResolution(Long resolution) {
        this.resolution = resolution;
        return this;
    }
    public Long getResolution() {
        return this.resolution;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setMediaRefs(CreativeAssetRef mediaRefs) {
        this.mediaRefs = mediaRefs;
        return this;
    }
    public CreativeAssetRef getMediaRefs() {
        return this.mediaRefs;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ExecAntcloudMarketingagentCreativeStoryboardRequest setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

}
