// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_0dcc7097c7d94b158412cd6014cbd292.Models
{
    public class BindDemoAaaBbbCccRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 123
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
