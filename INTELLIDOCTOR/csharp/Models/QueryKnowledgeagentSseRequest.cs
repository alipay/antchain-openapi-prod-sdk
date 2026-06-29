// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLIDOCTOR.Models
{
    public class QueryKnowledgeagentSseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 当前轮次消息id
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 问题
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

    }

}
