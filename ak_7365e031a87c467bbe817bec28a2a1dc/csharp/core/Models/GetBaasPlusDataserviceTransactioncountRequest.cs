// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_7365e031a87c467bbe817bec28a2a1dc.Models
{
    public class GetBaasPlusDataserviceTransactioncountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链唯一性标示
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

    }

}
