// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryPreTestUseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 2
        [NameInMap("struct_1")]
        [Validation(Required=true)]
        public PreTestUse Struct1 { get; set; }

        // 1
        [NameInMap("param_1")]
        [Validation(Required=true)]
        public string Param1 { get; set; }

    }

}
