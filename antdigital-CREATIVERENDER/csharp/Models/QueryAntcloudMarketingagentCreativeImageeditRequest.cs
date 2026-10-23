// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class QueryAntcloudMarketingagentCreativeImageeditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 子图编辑接口返回的独立消息 ID，必须属于当前调用用户及租户。
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

    }

}
