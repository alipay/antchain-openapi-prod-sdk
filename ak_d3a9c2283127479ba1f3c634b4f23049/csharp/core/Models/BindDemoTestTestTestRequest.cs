// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3a9c2283127479ba1f3c634b4f23049.Models
{
    public class BindDemoTestTestTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // test
        [NameInMap("test")]
        [Validation(Required=true)]
        public string Test { get; set; }

    }

}
