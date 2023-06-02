// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class QueryOperationtypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

        // 来源信息
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
