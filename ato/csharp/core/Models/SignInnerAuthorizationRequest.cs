// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SignInnerAuthorizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签署合同的流程id
        [NameInMap("flow_id")]
        [Validation(Required=true, MaxLength=64)]
        public string FlowId { get; set; }

        // true代表用户同意授权，
        // false代表不同意
        [NameInMap("auth_result")]
        [Validation(Required=true)]
        public bool? AuthResult { get; set; }

    }

}
