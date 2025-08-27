// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerFundmngmerchantperformanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户的社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 资方的社会统一信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

    }

}
