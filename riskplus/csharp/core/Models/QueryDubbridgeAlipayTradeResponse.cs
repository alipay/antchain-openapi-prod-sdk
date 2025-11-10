// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAlipayTradeResponse : TeaModel {
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

        // 订单状态
        // WAIT_BUYER_PAY（等待买家付款）、
        // TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、
        // TRADE_SUCCESS（交易支付成功）、
        // TRADE_FINISHED（交易结束，不可退款）
        [NameInMap("trade_status")]
        [Validation(Required=false)]
        public string TradeStatus { get; set; }

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 买家支付宝账号
        [NameInMap("buyer_logon_id")]
        [Validation(Required=false)]
        public string BuyerLogonId { get; set; }

        // 支付金额
        [NameInMap("pay_amount")]
        [Validation(Required=false)]
        public string PayAmount { get; set; }

        // 支付时间
        [NameInMap("pay_date")]
        [Validation(Required=false)]
        public string PayDate { get; set; }

    }

}
