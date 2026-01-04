// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent 运行相关信息
    public class AgentChatLogInfo : TeaModel {
        // 记忆参数列表
        // 
        [NameInMap("context_variable_list")]
        [Validation(Required=true)]
        public List<AgentVariable> ContextVariableList { get; set; }

        // 引用工具/工作流列表
        // 
        [NameInMap("tool_option_list")]
        [Validation(Required=true)]
        public List<ToolOptionInfo> ToolOptionList { get; set; }

        // 对话界面思维链显示标题结构
        [NameInMap("thought_chain_display")]
        [Validation(Required=true)]
        public ThoughtChainDisplay ThoughtChainDisplay { get; set; }

        // 思维链信息详情列表
        // 
        [NameInMap("thought_chain_display_unit_list")]
        [Validation(Required=true)]
        public List<ThoughtChainDisplayUnit> ThoughtChainDisplayUnitList { get; set; }

        // 该思维链有回答环节
        // 
        [NameInMap("has_response_type")]
        [Validation(Required=true)]
        public bool? HasResponseType { get; set; }

    }

}
