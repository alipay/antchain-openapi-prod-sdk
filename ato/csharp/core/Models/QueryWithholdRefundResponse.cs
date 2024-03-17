// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryWithholdRefundResponse : TeaModel {
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

        // 请求支付宝的退款单据号
        [NameInMap("refund_order_no")]
        [Validation(Required=false)]
        public string RefundOrderNo { get; set; }

        // 退款请求状态
        // ● ACCEPT: 受理成功
        // ● PENDING: 需人工介入
        // ● SUCCESS: 成功
        // ● FAILED : 失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 退款失败原因
        [NameInMap("refund_error_msg")]
        [Validation(Required=false)]
        public string RefundErrorMsg { get; set; }

        // 本笔交易总退款金额，单位为分
        // 12300=123元
        [NameInMap("total_refund_amount")]
        [Validation(Required=false)]
        public long? TotalRefundAmount { get; set; }

        // 本次退款申请的实际退款金额，单位为分
        // 12300=123元
        [NameInMap("send_back_amount")]
        [Validation(Required=false)]
        public long? SendBackAmount { get; set; }

        // 实际退款时间,13位时间戳（毫秒）
        [NameInMap("gmt_refund_pay")]
        [Validation(Required=false)]
        public long? GmtRefundPay { get; set; }

    }

}
