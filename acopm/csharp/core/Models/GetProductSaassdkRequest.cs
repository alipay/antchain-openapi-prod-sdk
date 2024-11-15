// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class GetProductSaassdkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 共享能力码
        [NameInMap("saas_code")]
        [Validation(Required=true)]
        public string SaasCode { get; set; }

    }

}
