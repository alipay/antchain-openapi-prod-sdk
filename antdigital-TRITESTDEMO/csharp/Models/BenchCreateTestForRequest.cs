// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRITESTDEMO.Models
{
    public class BenchCreateTestForRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 3000
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public string Timeout { get; set; }

    }

}
