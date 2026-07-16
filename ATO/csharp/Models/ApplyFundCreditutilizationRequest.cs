// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ApplyFundCreditutilizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单列表
        [NameInMap("order_list")]
        [Validation(Required=true)]
        public List<CreditUtilizationOrder> OrderList { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true, MaxLength=20)]
        public string TenantId { get; set; }

        // 商户统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=200)]
        public string MerchantId { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true, MaxLength=200)]
        public string FundId { get; set; }

        // 授信Id
        [NameInMap("granting_id")]
        [Validation(Required=true, MaxLength=20)]
        public string GrantingId { get; set; }

        // 用信授权id
        [NameInMap("utilization_auth_id")]
        [Validation(Required=true, MaxLength=20)]
        public string UtilizationAuthId { get; set; }

        // 用信id, 需保证唯一性
        [NameInMap("utilization_id")]
        [Validation(Required=true, MaxLength=20)]
        public string UtilizationId { get; set; }

    }

}
