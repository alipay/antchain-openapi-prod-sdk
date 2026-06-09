// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    public class AaavTestLiuyzRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // demo_param
        [NameInMap("demo_param")]
        [Validation(Required=true)]
        public DemoClass DemoParam { get; set; }

        // aa
        [NameInMap("param_a")]
        [Validation(Required=true)]
        public string ParamA { get; set; }

    }

}
