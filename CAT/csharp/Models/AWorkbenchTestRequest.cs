// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAT.Models
{
    public class AWorkbenchTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 超时时间
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public string Timeout { get; set; }

        // param
        [NameInMap("param")]
        [Validation(Required=true)]
        public string Param { get; set; }

        // owner
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
