// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ContextBreakdown extends TeaModel {
    // 系统提示词占用token数（估算）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("system_prompt")
    public Long systemPrompt;

    // Skill/插件提示词占用token数（估算）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("skills")
    public Long skills;

    // 工具定义占用token数（估算）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("tool_definitions")
    public Long toolDefinitions;

    // 对话历史占用token数（估算）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("conversation")
    public Long conversation;

    public static ContextBreakdown build(java.util.Map<String, ?> map) throws Exception {
        ContextBreakdown self = new ContextBreakdown();
        return TeaModel.build(map, self);
    }

    public ContextBreakdown setSystemPrompt(Long systemPrompt) {
        this.systemPrompt = systemPrompt;
        return this;
    }
    public Long getSystemPrompt() {
        return this.systemPrompt;
    }

    public ContextBreakdown setSkills(Long skills) {
        this.skills = skills;
        return this;
    }
    public Long getSkills() {
        return this.skills;
    }

    public ContextBreakdown setToolDefinitions(Long toolDefinitions) {
        this.toolDefinitions = toolDefinitions;
        return this;
    }
    public Long getToolDefinitions() {
        return this.toolDefinitions;
    }

    public ContextBreakdown setConversation(Long conversation) {
        this.conversation = conversation;
        return this;
    }
    public Long getConversation() {
        return this.conversation;
    }

}
