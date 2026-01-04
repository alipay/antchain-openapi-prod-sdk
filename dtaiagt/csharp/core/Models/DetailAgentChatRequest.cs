// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class DetailAgentChatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // agent_code
        [NameInMap("agent_code")]
        [Validation(Required=true)]
        public string AgentCode { get; set; }

        // session_id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

    }

}
