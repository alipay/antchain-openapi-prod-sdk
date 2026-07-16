// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncFundOrderfinancialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 商户在数科的租户ID
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=50)]
        public string MerchantTenantId { get; set; }

        // 订单融资唯一标识
        [NameInMap("application_id")]
        [Validation(Required=true, MaxLength=128)]
        public string ApplicationId { get; set; }

        // 订单融资状态：1-成功；2-失败
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 融资结果描述，长度不超过64
        [NameInMap("reason")]
        [Validation(Required=false, MaxLength=64)]
        public string Reason { get; set; }

        // 额外信息
        [NameInMap("extras")]
        [Validation(Required=false)]
        public string Extras { get; set; }

    }

}
