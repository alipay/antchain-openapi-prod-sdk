// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent详情查询VO
    public class AgentVO : TeaModel {
        // Agent的唯一标识符
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // Agent唯一uid
        // 
        [NameInMap("unique_code")]
        [Validation(Required=true)]
        public string UniqueCode { get; set; }

        // Agent名称
        // 
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // Agent 版本
        // 
        [NameInMap("agent_version")]
        [Validation(Required=true)]
        public string AgentVersion { get; set; }

        // Agent类型 "multi", "多智能体应用" "workflow", "工作流应用""lite", "轻量应用"  "external", "外部应用"
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // Agent描述
        // 
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // Agent创建人
        // 
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // Agent创建时间
        // 
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // Agent编辑时间
        // 
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // Agent安全审核配置
        // 
        [NameInMap("sec_config")]
        [Validation(Required=true)]
        public AgentSecConfig SecConfig { get; set; }

        // 欢迎语
        // 
        [NameInMap("welcome")]
        [Validation(Required=true)]
        public string Welcome { get; set; }

        // 是否展示关联问题
        // 
        [NameInMap("show_related_questions")]
        [Validation(Required=true)]
        public bool? ShowRelatedQuestions { get; set; }

        // 关联问题自定义prompt
        // 
        [NameInMap("related_question_prompt")]
        [Validation(Required=true)]
        public string RelatedQuestionPrompt { get; set; }

        // 额外信息 ，Map<String, Object>
        [NameInMap("extra_info")]
        [Validation(Required=true)]
        public string ExtraInfo { get; set; }

        // extra_info (额外信息) 字段的json形式，格式为：Map<String, Object>
        [NameInMap("extra_info_json")]
        [Validation(Required=true)]
        public string ExtraInfoJson { get; set; }

        // 交互类型 VOICE / AVATAR / VIDEO
        // 
        [NameInMap("interaction_type")]
        [Validation(Required=true)]
        public string InteractionType { get; set; }

        // 音色
        // 
        [NameInMap("voice")]
        [Validation(Required=true)]
        public string Voice { get; set; }

        // agent模型版本 {model}/{version}#{adapter} (deprecated)
        // 
        [NameInMap("model")]
        [Validation(Required=true)]
        public string Model { get; set; }

        // Agent模型配置表
        // 
        [NameInMap("model_list")]
        [Validation(Required=true)]
        public List<AgentModelParams> ModelList { get; set; }

        // Agent关联知识库ID列表
        // 
        [NameInMap("ref_library_ids")]
        [Validation(Required=true)]
        public List<string> RefLibraryIds { get; set; }

        // Agent关联插件信息表, key为插件主键id, value为信息
        // 
        [NameInMap("ref_plugins")]
        [Validation(Required=true)]
        public List<AgentRefPluginInfo> RefPlugins { get; set; }

        // 关联的mcpServer
        // 
        [NameInMap("ref_mcp_servers")]
        [Validation(Required=true)]
        public List<AgentRefPluginInfo> RefMcpServers { get; set; }

        // 隶属multi-agent的sub agents
        // 
        [NameInMap("sub_agents")]
        [Validation(Required=true)]
        public List<SubAgentInfo> SubAgents { get; set; }

        // Agent关联workflow信息表, key为intent wutong id, value为信息
        // 
        [NameInMap("ref_workflows")]
        [Validation(Required=true)]
        public List<AgentRefPluginInfo> RefWorkflows { get; set; }

        // 关联卡片id列表
        // 
        [NameInMap("ref_card_ids")]
        [Validation(Required=true)]
        public List<string> RefCardIds { get; set; }

    }

}
