// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class QueryBlockchainBotAgentDailysummaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备客户端ID；与 agent_id 至少传一个
        [NameInMap("client_id")]
        [Validation(Required=false)]
        public string ClientId { get; set; }

        // 智能体ID；与 client_id 至少传一个，两者同时传入时必须与设备绑定的智能体一致
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

        // 总结日期，格式 yyyy-MM-dd，按 GMT+8 自然日
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

    }

}
