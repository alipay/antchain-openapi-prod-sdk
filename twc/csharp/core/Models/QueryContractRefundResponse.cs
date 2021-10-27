// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractRefundResponse : TeaModel {
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

        // 退款id
        [NameInMap("refund_id")]
        [Validation(Required=false)]
        public string RefundId { get; set; }

        // 退款时间（时间戳，单位：ms）
        [NameInMap("refund_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RefundTime { get; set; }

        // 本次退款请求的退款金额（单位：分）
        [NameInMap("refund_amount")]
        [Validation(Required=false)]
        public long? RefundAmount { get; set; }

        // 退款状态
        // REFUNDING 退款中
        // SUCCESS 退款成功
        // FAIL 退款失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 退款错误信息
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

    }

}
