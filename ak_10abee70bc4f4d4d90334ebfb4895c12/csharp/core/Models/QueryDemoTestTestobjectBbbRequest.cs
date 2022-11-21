// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_10abee70bc4f4d4d90334ebfb4895c12.Models
{
    public class QueryDemoTestTestobjectBbbRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 测试入参
        [NameInMap("request_param1")]
        [Validation(Required=true)]
        public string RequestParam1 { get; set; }

        // 测试入参2
        [NameInMap("request_param2")]
        [Validation(Required=true)]
        public string RequestParam2 { get; set; }

    }

}
