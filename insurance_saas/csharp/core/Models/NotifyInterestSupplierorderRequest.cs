// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class NotifyInterestSupplierorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求流水号，每次唯一
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 贵方订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 我方权益编号
        [NameInMap("interest_no")]
        [Validation(Required=true)]
        public string InterestNo { get; set; }

        // 用户授权状态
        [NameInMap("user_permit_status")]
        [Validation(Required=true)]
        public string UserPermitStatus { get; set; }

        // 权益订单状态
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 退款金额，单位元
        [NameInMap("refund_amount")]
        [Validation(Required=false)]
        public string RefundAmount { get; set; }

        // 退款时间
        [NameInMap("refund_time")]
        [Validation(Required=false)]
        public string RefundTime { get; set; }

        // 公证状态
        [NameInMap("notary_status")]
        [Validation(Required=false)]
        public string NotaryStatus { get; set; }

        // 支付时间
        [NameInMap("payment_time")]
        [Validation(Required=false)]
        public string PaymentTime { get; set; }

        // 版本号
        [NameInMap("interest_version")]
        [Validation(Required=false)]
        public string InterestVersion { get; set; }

    }

}
