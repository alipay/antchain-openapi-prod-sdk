// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRTESTDEMO.Models
{
    public class QueryExternalFailureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 入参
        [NameInMap("param")]
        [Validation(Required=true)]
        public string Param { get; set; }

    }

}
