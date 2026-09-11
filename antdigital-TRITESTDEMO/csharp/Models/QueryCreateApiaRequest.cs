// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRITESTDEMO.Models
{
    public class QueryCreateApiaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 描述
        [NameInMap("aaa")]
        [Validation(Required=false)]
        public string Aaa { get; set; }

    }

}
