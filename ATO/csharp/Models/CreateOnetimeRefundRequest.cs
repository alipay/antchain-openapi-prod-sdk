// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateOnetimeRefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 外部系统传入的退款请求号
        [NameInMap("refund_request_no")]
        [Validation(Required=true)]
        public string RefundRequestNo { get; set; }

        // 本次请求的退款金额，单位为分
        // 1234=12.34元
        [NameInMap("refund_money")]
        [Validation(Required=true)]
        public long? RefundMoney { get; set; }

        // 退款原因
        [NameInMap("refund_reason")]
        [Validation(Required=false)]
        public string RefundReason { get; set; }

        // 退分账信息列表（最多支持10家分账方退分账信息），金额单位分
        [NameInMap("refund_divide_trans_out_info_list")]
        [Validation(Required=false)]
        public string RefundDivideTransOutInfoList { get; set; }

    }

}
