// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SendWithholdRefundResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
        [NameInMap("refund_amount")]
        [Validation(Required=false)]
        public string RefundAmount { get; set; }

        // 退款成功的日期
        [NameInMap("refund_date")]
        [Validation(Required=false)]
        public string RefundDate { get; set; }

        // 退款的支付宝系统内部单据id
        [NameInMap("refund_order_id")]
        [Validation(Required=false)]
        public string RefundOrderId { get; set; }

        // FINISHED,退款成功的状态值
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
