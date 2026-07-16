// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInnerWithholdsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户租户id
        [NameInMap("merchant_tenant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string MerchantTenantId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 用户支付宝2088uid
        [NameInMap("alipay_user_id")]
        [Validation(Required=false, MaxLength=64)]
        public string AlipayUserId { get; set; }

        // 合并签署的flowid
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

    }

}
