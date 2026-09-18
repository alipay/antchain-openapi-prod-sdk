// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ApplyPoiRefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 退款单号，由发起方生成保证唯一（幂等键）
        [NameInMap("refund_no")]
        [Validation(Required=true)]
        public string RefundNo { get; set; }

        // 被退款的支付订单号（内部反查trade_no）
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 活体部分退款金额（元，两位小数）；与mall_refund_amount至少一项必填且>0
        [NameInMap("pet_refund_amount")]
        [Validation(Required=false)]
        public string PetRefundAmount { get; set; }

        // 商城部分退款金额（元，两位小数），即退回的预充值余额
        [NameInMap("mall_refund_amount")]
        [Validation(Required=false)]
        public string MallRefundAmount { get; set; }

        // 退款原因
        [NameInMap("refund_reason")]
        [Validation(Required=false)]
        public string RefundReason { get; set; }

    }

}
