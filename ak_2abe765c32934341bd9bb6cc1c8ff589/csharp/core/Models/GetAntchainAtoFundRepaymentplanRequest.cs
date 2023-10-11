// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    public class GetAntchainAtoFundRepaymentplanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id，不可为空
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 商户在数科注册的tenantId，不可为空
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=50)]
        public string MerchantTenantId { get; set; }

        // 用户的支付宝uid
        [NameInMap("alipay_uid")]
        [Validation(Required=true, MaxLength=50)]
        public string AlipayUid { get; set; }

    }

}
