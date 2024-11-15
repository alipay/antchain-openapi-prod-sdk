// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class QueryApiDetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // demo
        [NameInMap("target_prod")]
        [Validation(Required=true)]
        public string TargetProd { get; set; }

        // demo
        [NameInMap("target_api")]
        [Validation(Required=true)]
        public string TargetApi { get; set; }

    }

}
