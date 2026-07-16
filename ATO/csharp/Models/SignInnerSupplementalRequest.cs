// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SignInnerSupplementalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string TenantId { get; set; }

        // 同意接受用户补充接口，目前取值只能为true
        [NameInMap("auth_result")]
        [Validation(Required=true)]
        public bool? AuthResult { get; set; }

    }

}
