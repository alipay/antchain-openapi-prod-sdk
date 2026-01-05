// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class QueryDacQuotaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // your company external customer id
        [NameInMap("external_customer_id")]
        [Validation(Required=true)]
        public string ExternalCustomerId { get; set; }

        // blockchain:Ethereum,Polygon,etc
        [NameInMap("blockchain")]
        [Validation(Required=true)]
        public string Blockchain { get; set; }

        // token symbol:USDC,USDT,etc
        [NameInMap("token_symbol")]
        [Validation(Required=true)]
        public string TokenSymbol { get; set; }

        // quotaType:DEPOSIT/WITHDRAWAL
        [NameInMap("quota_type")]
        [Validation(Required=true)]
        public string QuotaType { get; set; }

    }

}
