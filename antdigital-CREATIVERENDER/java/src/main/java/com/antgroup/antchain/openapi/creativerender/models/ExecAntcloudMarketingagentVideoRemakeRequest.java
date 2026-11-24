// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class ExecAntcloudMarketingagentVideoRemakeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 阶段一 task_id（= 阶段一 messageId）
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

    // 本轮 USER 消息展示文案
    @NameInMap("prompt")
    public String prompt;

    public static ExecAntcloudMarketingagentVideoRemakeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudMarketingagentVideoRemakeRequest self = new ExecAntcloudMarketingagentVideoRemakeRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudMarketingagentVideoRemakeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudMarketingagentVideoRemakeRequest setStoryboardMessageId(String storyboardMessageId) {
        this.storyboardMessageId = storyboardMessageId;
        return this;
    }
    public String getStoryboardMessageId() {
        return this.storyboardMessageId;
    }

    public ExecAntcloudMarketingagentVideoRemakeRequest setNewStoryboardScript(String newStoryboardScript) {
        this.newStoryboardScript = newStoryboardScript;
        return this;
    }
    public String getNewStoryboardScript() {
        return this.newStoryboardScript;
    }

    public ExecAntcloudMarketingagentVideoRemakeRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ExecAntcloudMarketingagentVideoRemakeRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
