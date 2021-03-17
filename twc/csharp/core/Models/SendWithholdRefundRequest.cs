// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SendWithholdRefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝支付单据号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 外部订单号,请求方保证唯一性
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

        // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public string RefundAmount { get; set; }

        // 退款备注
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

    }

}
