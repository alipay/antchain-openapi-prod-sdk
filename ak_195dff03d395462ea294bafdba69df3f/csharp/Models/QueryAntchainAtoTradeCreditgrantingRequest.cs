// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class QueryAntchainAtoTradeCreditgrantingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // granting_id
        [NameInMap("granting_id")]
        [Validation(Required=true, MaxLength=49)]
        public string GrantingId { get; set; }

        // merchant_id
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=63)]
        public string MerchantId { get; set; }

    }

}
