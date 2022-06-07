// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class QueryTradeResponse : TeaModel {
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

        // 商户订单号
        [NameInMap("merchant_order_no")]
        [Validation(Required=false)]
        public string MerchantOrderNo { get; set; }

        // 来源场景码
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 渠道场景码
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 交易状态
        // WAIT_BUYER_PAY - 交易创建，等待买家付款
        // TRADE_CLOSED - 未付款交易超时关闭，或支付完成后全额退款
        // TRADE_SUCCESS - 交易成功
        [NameInMap("trade_status")]
        [Validation(Required=false)]
        public string TradeStatus { get; set; }

        // 币种，默认156-人民币
        [NameInMap("currency_value")]
        [Validation(Required=false)]
        public string CurrencyValue { get; set; }

        // 交易结算信息
        [NameInMap("trade_settle_info")]
        [Validation(Required=false)]
        public List<TradeSettleDetail> TradeSettleInfo { get; set; }

    }

}
