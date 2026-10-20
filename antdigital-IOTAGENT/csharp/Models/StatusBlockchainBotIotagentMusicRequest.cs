// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class StatusBlockchainBotIotagentMusicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体 ID，与client_id至少填1项
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

        // 客户端 ID，与agent_id至少填1项
        [NameInMap("client_id")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

    }

}
