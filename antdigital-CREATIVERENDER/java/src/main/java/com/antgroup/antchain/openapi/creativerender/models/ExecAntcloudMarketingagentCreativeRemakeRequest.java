// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentCreativeRemakeRequest extends TeaModel {
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

    // 阶段一 task_id（= 阶段一 messageId），后端据此反查阶段一全部快照
    @NameInMap("storyboard_message_id")
    @Validation(required = true)
    public String storyboardMessageId;

    // 用户编辑后的新分镜脚本（纯字符串）；
    @NameInMap("new_storyboard_script")
    @Validation(required = true)
    public String newStoryboardScript;

    // 拆解返回的会话id
    @NameInMap("session_id")
    @Validation(required = true)
    public String sessionId;

    // 画布id
    @NameInMap("canvas_id")
    public String canvasId;

    // 本轮 USER 消息展示文案
    @NameInMap("prompt")
    public String prompt;

    public static ExecAntcloudMarketingagentCreativeRemakeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentCreativeRemakeRequest self = new ExecAntcloudMarketingagentCreativeRemakeRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setStoryboardMessageId(String storyboardMessageId) {
        this.storyboardMessageId = storyboardMessageId;
        return this;
    }
    public String getStoryboardMessageId() {
        return this.storyboardMessageId;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setNewStoryboardScript(String newStoryboardScript) {
        this.newStoryboardScript = newStoryboardScript;
        return this;
    }
    public String getNewStoryboardScript() {
        return this.newStoryboardScript;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setCanvasId(String canvasId) {
        this.canvasId = canvasId;
        return this;
    }
    public String getCanvasId() {
        return this.canvasId;
    }

    public ExecAntcloudMarketingagentCreativeRemakeRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
