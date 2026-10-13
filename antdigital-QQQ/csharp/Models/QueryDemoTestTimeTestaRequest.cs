// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    public class QueryDemoTestTimeTestaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // a
        [NameInMap("a")]
        [Validation(Required=false)]
        public string A { get; set; }

        // b
        [NameInMap("b")]
        [Validation(Required=false)]
        public TestClass B { get; set; }

    }

}
