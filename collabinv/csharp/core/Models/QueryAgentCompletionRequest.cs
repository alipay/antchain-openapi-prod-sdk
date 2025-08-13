// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryAgentCompletionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 查询词条
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
        [NameInMap("alive_time")]
        [Validation(Required=false)]
        public long? AliveTime { get; set; }

        // agent_id
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

    }

}
