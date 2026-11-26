// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ListBlockchainBotIotagentKbRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 目标 Agent ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 页码，从 1 开始，默认 1
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 每页数量，默认 20，最大 100
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
