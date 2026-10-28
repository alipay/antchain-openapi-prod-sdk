// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ActionIotagentSessioncontextRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体 ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 操作类型：COMPACT_CURRENT
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

    }

}
