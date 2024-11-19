// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryFundCompensateaccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资方社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true, MaxLength=64)]
        public string FundId { get; set; }

        // 商户社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string MerchantId { get; set; }

        // 商户租户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string MerchantTenantId { get; set; }

    }

}
