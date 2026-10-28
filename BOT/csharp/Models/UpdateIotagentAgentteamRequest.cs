// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateIotagentAgentteamRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 实例id
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

        // 模型
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 子智能体ids
        [NameInMap("sub_agents")]
        [Validation(Required=true)]
        public List<string> SubAgents { get; set; }

    }

}
