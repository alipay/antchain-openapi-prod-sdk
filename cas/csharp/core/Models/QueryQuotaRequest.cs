// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryQuotaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        //  维度标识, 可选
        [NameInMap("dim_identity")]
        [Validation(Required=false)]
        public string DimIdentity { get; set; }

        // resource_identity
        [NameInMap("resource_identity")]
        [Validation(Required=false)]
        public string ResourceIdentity { get; set; }

    }

}
