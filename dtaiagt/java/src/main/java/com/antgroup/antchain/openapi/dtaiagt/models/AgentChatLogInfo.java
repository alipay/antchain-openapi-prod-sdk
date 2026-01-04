// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentChatLogInfo extends TeaModel {
    // 记忆参数列表
    // 
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("context_variable_list")
    @Validation(required = true)
    public java.util.List<AgentVariable> contextVariableList;

    // 引用工具/工作流列表
    // 
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("tool_option_list")
    @Validation(required = true)
    public java.util.List<ToolOptionInfo> toolOptionList;

    // 对话界面思维链显示标题结构
    @NameInMap("thought_chain_display")
    @Validation(required = true)
    public ThoughtChainDisplay thoughtChainDisplay;

    // 思维链信息详情列表
    // 
    @NameInMap("thought_chain_display_unit_list")
    @Validation(required = true)
    public java.util.List<ThoughtChainDisplayUnit> thoughtChainDisplayUnitList;

    // 该思维链有回答环节
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_response_type")
    @Validation(required = true)
    public Boolean hasResponseType;

    public static AgentChatLogInfo build(java.util.Map<String, ?> map) throws Exception {
        AgentChatLogInfo self = new AgentChatLogInfo();
        return TeaModel.build(map, self);
    }

    public AgentChatLogInfo setContextVariableList(java.util.List<AgentVariable> contextVariableList) {
        this.contextVariableList = contextVariableList;
        return this;
    }
    public java.util.List<AgentVariable> getContextVariableList() {
        return this.contextVariableList;
    }

    public AgentChatLogInfo setToolOptionList(java.util.List<ToolOptionInfo> toolOptionList) {
        this.toolOptionList = toolOptionList;
        return this;
    }
    public java.util.List<ToolOptionInfo> getToolOptionList() {
        return this.toolOptionList;
    }

    public AgentChatLogInfo setThoughtChainDisplay(ThoughtChainDisplay thoughtChainDisplay) {
        this.thoughtChainDisplay = thoughtChainDisplay;
        return this;
    }
    public ThoughtChainDisplay getThoughtChainDisplay() {
        return this.thoughtChainDisplay;
    }

    public AgentChatLogInfo setThoughtChainDisplayUnitList(java.util.List<ThoughtChainDisplayUnit> thoughtChainDisplayUnitList) {
        this.thoughtChainDisplayUnitList = thoughtChainDisplayUnitList;
        return this;
    }
    public java.util.List<ThoughtChainDisplayUnit> getThoughtChainDisplayUnitList() {
        return this.thoughtChainDisplayUnitList;
    }

    public AgentChatLogInfo setHasResponseType(Boolean hasResponseType) {
        this.hasResponseType = hasResponseType;
        return this;
    }
    public Boolean getHasResponseType() {
        return this.hasResponseType;
    }

}
