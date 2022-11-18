// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_e0abf2b646994b848fb7d1e624ba5110.Models
{
    public class QueryDemoSaasTestTestaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 张三
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 12
        [NameInMap("age")]
        [Validation(Required=true)]
        public long? Age { get; set; }

    }

}
