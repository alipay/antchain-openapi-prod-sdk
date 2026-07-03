// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAlipayRefundResponse : TeaModel {
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

        // 退款状态 REFUNDING（交易退款中）、 REFUND_SUCCESS（交易退款成功）、 REFUND_FAIL（交易退款失败）
        [NameInMap("refund_status")]
        [Validation(Required=false)]
        public string RefundStatus { get; set; }

        // 退款失败原因
        [NameInMap("refund_fail_reason")]
        [Validation(Required=false)]
        public string RefundFailReason { get; set; }

        // 退款时间
        [NameInMap("refund_date")]
        [Validation(Required=false)]
        public string RefundDate { get; set; }

    }

}
