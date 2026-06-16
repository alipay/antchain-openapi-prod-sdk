// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class WithdrawOrderSettlementResponse : TeaModel {
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

        // 支付交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 外部订单号(同一个outProductId唯一)
        [NameInMap("out_order_no")]
        [Validation(Required=false)]
        public string OutOrderNo { get; set; }

        // 退分账时间，格式为yyyy-MM-dd HH:mm:ss
        [NameInMap("refund_time")]
        [Validation(Required=false)]
        public string RefundTime { get; set; }

        // 分账账单
        [NameInMap("settle_no")]
        [Validation(Required=false)]
        public string SettleNo { get; set; }

        // 退分账唯一编号
        [NameInMap("refund_no")]
        [Validation(Required=false)]
        public string RefundNo { get; set; }

    }

}
