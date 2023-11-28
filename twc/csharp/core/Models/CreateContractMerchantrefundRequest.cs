// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractMerchantrefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合同id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 退款请求对应的第三方ID（也叫退款ID），需保证同一平台方下唯一
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

        // 订单id
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 退款金额（单位：分）
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public long? RefundAmount { get; set; }

        // 租赁宝租赁订单号
        [NameInMap("bcl_order_id")]
        [Validation(Required=false)]
        public string BclOrderId { get; set; }

        // 租赁订单对应的租户id
        [NameInMap("bcl_tenant_id")]
        [Validation(Required=false)]
        public string BclTenantId { get; set; }

    }

}
