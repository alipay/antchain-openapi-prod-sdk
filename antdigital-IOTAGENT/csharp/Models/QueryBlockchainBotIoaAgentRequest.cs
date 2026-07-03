// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class QueryBlockchainBotIoaAgentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体ID
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

        // 客户端ID，一般是设备MAC地址，若没有agentId时可传入client_id查询对应的agent_id
        [NameInMap("client_id")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

    }

}
