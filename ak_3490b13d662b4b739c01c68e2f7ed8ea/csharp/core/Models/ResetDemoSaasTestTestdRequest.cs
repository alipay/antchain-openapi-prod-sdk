// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_3490b13d662b4b739c01c68e2f7ed8ea.Models
{
    public class ResetDemoSaasTestTestdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // test
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
