// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class StopAgentChatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // chat_id
        [NameInMap("chat_id")]
        [Validation(Required=true)]
        public string ChatId { get; set; }

        // agent_id
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 会话ID，非必填，拓展用
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

    }

}
