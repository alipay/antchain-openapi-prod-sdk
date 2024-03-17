// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateWithholdRefundResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 外部系统传入的退款请求号
        [NameInMap("refund_request_no")]
        [Validation(Required=false)]
        public string RefundRequestNo { get; set; }

        // ACCEPT : 受理成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 请求支付宝的退款单据号
        [NameInMap("refund_order_no")]
        [Validation(Required=false)]
        public string RefundOrderNo { get; set; }

    }

}
