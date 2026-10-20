// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class CreateBlockchainBotIotagentAgentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体名称
        [NameInMap("agent_name")]
        [Validation(Required=true)]
        public string AgentName { get; set; }

        // 实例Id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 系统提示词
        [NameInMap("system_prompt")]
        [Validation(Required=false)]
        public string SystemPrompt { get; set; }

        // 模型提供方
        [NameInMap("model_provider")]
        [Validation(Required=true)]
        public string ModelProvider { get; set; }

        // 模型名称
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // sklil内容
        [NameInMap("skills")]
        [Validation(Required=false)]
        public List<SkillInfo> Skills { get; set; }

        // mcp配置
        [NameInMap("mcps")]
        [Validation(Required=false)]
        public List<McpInfo> Mcps { get; set; }

    }

}
