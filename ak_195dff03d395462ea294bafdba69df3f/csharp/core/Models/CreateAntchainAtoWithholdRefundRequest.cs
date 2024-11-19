// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class CreateAntchainAtoWithholdRefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=128)]
        public string OrderId { get; set; }

        // 第几期
        // 针对用户履约的第几期进行退款申请
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 外部系统传入的退款请求号
        [NameInMap("refund_request_no")]
        [Validation(Required=true, MaxLength=128)]
        public string RefundRequestNo { get; set; }

        // 本次请求的退款金额，单位为分
        // 1234=12.34元
        [NameInMap("refund_money")]
        [Validation(Required=true)]
        public long? RefundMoney { get; set; }

        // 退款原因
        [NameInMap("refund_reason")]
        [Validation(Required=false, MaxLength=200)]
        public string RefundReason { get; set; }

        // 支付类型
        // ORDER_BUYOUT:买断金
        // ORDER_PENALTY:违约金
        // PERFORMANCE:正常履约（默认）
        [NameInMap("pay_type")]
        [Validation(Required=false, MaxLength=64)]
        public string PayType { get; set; }

    }

}
