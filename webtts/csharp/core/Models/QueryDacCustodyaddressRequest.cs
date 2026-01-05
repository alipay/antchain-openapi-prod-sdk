// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class QueryDacCustodyaddressRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链名称
        [NameInMap("blockchain")]
        [Validation(Required=true)]
        public string Blockchain { get; set; }

        // 外部客户唯一id
        [NameInMap("external_customer_id")]
        [Validation(Required=true)]
        public string ExternalCustomerId { get; set; }

    }

}
