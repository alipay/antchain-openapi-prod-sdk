// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryWithholdRefundRequest : TeaModel {
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

        // 几期
        // 针对用户履约的第几期进行退款申请
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 外部系统传入的退款请求号
        [NameInMap("refund_request_no")]
        [Validation(Required=true, MaxLength=128)]
        public string RefundRequestNo { get; set; }

        // 支付类型
        // ORDER_BUYOUT:买断金
        // ORDER_PENALTY:违约金
        // PERFORMANCE:正常履约（默认）
        [NameInMap("pay_type")]
        [Validation(Required=false, MaxLength=64)]
        public string PayType { get; set; }

    }

}
