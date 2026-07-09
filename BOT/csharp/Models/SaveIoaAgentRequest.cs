// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SaveIoaAgentRequest : TeaModel {
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

        // 智能体名称
        [NameInMap("agent_name")]
        [Validation(Required=false)]
        public string AgentName { get; set; }

        // 语言Code
        [NameInMap("lang_code")]
        [Validation(Required=false)]
        public string LangCode { get; set; }

        // 音色ID
        [NameInMap("tts_voice_id")]
        [Validation(Required=false)]
        public string TtsVoiceId { get; set; }

        // 系统提示词
        [NameInMap("system_prompt")]
        [Validation(Required=false)]
        public string SystemPrompt { get; set; }

        // 父模板智能体ID
        [NameInMap("parent_template_agent_id")]
        [Validation(Required=false)]
        public string ParentTemplateAgentId { get; set; }

    }

}
