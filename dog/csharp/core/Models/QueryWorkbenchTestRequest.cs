// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DOG.Models
{
    public class QueryWorkbenchTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 3000
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public string Timeout { get; set; }

        // 1
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

        // 2022-11-07 14:46
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

        // call for back
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

        // wanyi
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
