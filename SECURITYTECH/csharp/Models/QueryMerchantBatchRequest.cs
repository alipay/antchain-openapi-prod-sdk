// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryMerchantBatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户号列表
        [NameInMap("merchant_ids")]
        [Validation(Required=false)]
        public List<string> MerchantIds { get; set; }

        // usci+industry 组合列表
        [NameInMap("usci_industry_pairs")]
        [Validation(Required=false)]
        public List<MaoUsciIndustryPair> UsciIndustryPairs { get; set; }

    }

}
