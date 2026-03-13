// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAgoraxTradeRefundResponse : TeaModel {
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

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 创建交易传入的商户订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

        // 本笔退款对应的退款请求号
        [NameInMap("out_request_no")]
        [Validation(Required=false)]
        public string OutRequestNo { get; set; }

        // 该笔退款所对应的交易的订单金额
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public string TotalAmount { get; set; }

        // 本次退款请求，对应的退款金额
        [NameInMap("refund_amount")]
        [Validation(Required=false)]
        public string RefundAmount { get; set; }

        // 退款状态
        [NameInMap("refund_status")]
        [Validation(Required=false)]
        public string RefundStatus { get; set; }

        // 退分账明细信息
        [NameInMap("refund_royaltys")]
        [Validation(Required=false)]
        public List<RefundRoyaltyResult> RefundRoyaltys { get; set; }

        // 本次商户实际退回金额
        [NameInMap("send_back_fee")]
        [Validation(Required=false)]
        public string SendBackFee { get; set; }

    }

}
