// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryBclRefundResponse : TeaModel {
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

        // 退款成功的时间, 退款成功返回
        [NameInMap("refund_time")]
        [Validation(Required=false)]
        public string RefundTime { get; set; }

        // 退款金额, 单位分, 退款成功时返回
        [NameInMap("refund_amount")]
        [Validation(Required=false)]
        public long? RefundAmount { get; set; }

        // ● 退款中，REFUNDING（需要调用查询接口查询结果)；
        // ● 退款成功REFUND_SUCCESS
        // ● 退款失败REFUND_FAIL
        [NameInMap("refund_status")]
        [Validation(Required=false)]
        public string RefundStatus { get; set; }

        // 退款失败原因, 退款失败时返回
        [NameInMap("err_msg")]
        [Validation(Required=false)]
        public string ErrMsg { get; set; }

    }

}
