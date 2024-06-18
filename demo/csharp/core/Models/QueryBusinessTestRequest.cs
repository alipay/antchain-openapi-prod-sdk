// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryBusinessTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // jzq
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 1
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
