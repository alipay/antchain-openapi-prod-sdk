// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_50c620ebd72240219637191db5c3441d.Models
{
    public class QueryDemoGatewayEmbedRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实例参数
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public string Timeout { get; set; }

    }

}
