// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.Models
{
    public class QueryDemoApdevcenterTestobjectTestsubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // test
        [NameInMap("test")]
        [Validation(Required=true, MaxLength=200)]
        public string Test { get; set; }

    }

}
