// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class SyncTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 商户订单号
        [NameInMap("merchant_order_no")]
        [Validation(Required=true)]
        public string MerchantOrderNo { get; set; }

        // 行业场景码(由经支中台分配给业务方)
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 行业渠道码(由经支中台分配给业务方)
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 交易金额, 最小到分, 支持0元
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 币种，默认156-人民币
        [NameInMap("currency_value")]
        [Validation(Required=false)]
        public string CurrencyValue { get; set; }

        // 交易标题
        [NameInMap("subject")]
        [Validation(Required=false)]
        public string Subject { get; set; }

        // 交易详情(例如商品、价格快照、数量等)
        [NameInMap("body")]
        [Validation(Required=false)]
        public string Body { get; set; }

        // 支付渠道, 当前仅支持ZFT-直付通
        [NameInMap("pay_product_code")]
        [Validation(Required=true)]
        public string PayProductCode { get; set; }

        // 交易收款方支付宝uid
        [NameInMap("payee_id")]
        [Validation(Required=true)]
        public string PayeeId { get; set; }

        // 交易付款方支付宝uid
        [NameInMap("payer_id")]
        [Validation(Required=true)]
        public string PayerId { get; set; }

        // 交易创建时间
        [NameInMap("gmt_trade_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtTradeCreate { get; set; }

        // 交易支付时间
        [NameInMap("gmt_trade_pay")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtTradePay { get; set; }

        // 交易完成时间
        [NameInMap("gmt_trade_complete")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtTradeComplete { get; set; }

        // 交易状态
        [NameInMap("trade_status")]
        [Validation(Required=true)]
        public string TradeStatus { get; set; }

        // 扩展字段，json串
        [NameInMap("properties")]
        [Validation(Required=true)]
        public string Properties { get; set; }

    }

}
