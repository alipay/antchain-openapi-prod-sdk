// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ERAPROD.Models
{
    public class OperateAgentProxyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // json 序列化后的请求入参
        [NameInMap("request_json")]
        [Validation(Required=true)]
        public string RequestJson { get; set; }

    }

}
