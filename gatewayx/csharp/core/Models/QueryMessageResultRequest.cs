// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    public class QueryMessageResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 消息id
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

    }

}
