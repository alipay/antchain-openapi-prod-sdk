// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CallbackSpiCompletecommodityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 南天门的请求体都是做成json字符串放在data字段里
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
