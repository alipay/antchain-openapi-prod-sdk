// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryAaaMultiCccRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 12
        [NameInMap("idcard")]
        [Validation(Required=false)]
        public CardInfo Idcard { get; set; }

        // 1
        [NameInMap("test")]
        [Validation(Required=false)]
        public string Test { get; set; }

        // 123456
        [NameInMap("demo_info")]
        [Validation(Required=false)]
        public DemoInfo DemoInfo { get; set; }

    }

}
