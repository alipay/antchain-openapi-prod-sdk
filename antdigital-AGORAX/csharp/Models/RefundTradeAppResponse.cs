// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class RefundTradeAppResponse : TeaModel {
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

        // 原支付业务订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

        // 本次退款业务号
        [NameInMap("out_request_no")]
        [Validation(Required=false)]
        public string OutRequestNo { get; set; }

        // 本次退款金额，单位：元
        [NameInMap("refund_amount")]
        [Validation(Required=false)]
        public string RefundAmount { get; set; }

        // 当前累计成功退款金额，单位：元
        [NameInMap("total_refund_amount")]
        [Validation(Required=false)]
        public string TotalRefundAmount { get; set; }

        // 退款状态
        [NameInMap("refund_status")]
        [Validation(Required=false)]
        public string RefundStatus { get; set; }

    }

}
