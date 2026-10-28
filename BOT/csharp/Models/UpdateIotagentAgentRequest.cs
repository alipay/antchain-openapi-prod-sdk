// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateIotagentAgentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体id
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 智能体名字
        [NameInMap("agent_name")]
        [Validation(Required=true)]
        public string AgentName { get; set; }

        // 智能体提示词
        [NameInMap("system_prompt")]
        [Validation(Required=false)]
        public string SystemPrompt { get; set; }

        // 模型提供方
        [NameInMap("model_provider")]
        [Validation(Required=true)]
        public string ModelProvider { get; set; }

        // 模型id
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // skill集合
        [NameInMap("skills")]
        [Validation(Required=true)]
        public List<SkillInfo> Skills { get; set; }

        // mcp配置
        [NameInMap("mcps")]
        [Validation(Required=false)]
        public List<McpInfo> Mcps { get; set; }

        // 实例id，不允许编辑
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
