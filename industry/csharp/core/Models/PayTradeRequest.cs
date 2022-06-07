// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class PayTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
        [NameInMap("merchant_order_no")]
        [Validation(Required=true)]
        public string MerchantOrderNo { get; set; }

        // 来源场景码, 由中台分配给业务方
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 渠道
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 交易币种，默认：人民币（156）
        [NameInMap("currency_value")]
        [Validation(Required=false)]
        public string CurrencyValue { get; set; }

        // 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
        [NameInMap("subject")]
        [Validation(Required=false)]
        public string Subject { get; set; }

        // 交易信息
        [NameInMap("body")]
        [Validation(Required=false)]
        public string Body { get; set; }

        // 收款方id
        [NameInMap("payee_id")]
        [Validation(Required=true)]
        public string PayeeId { get; set; }

        // 付款方id
        [NameInMap("payer_id")]
        [Validation(Required=true)]
        public string PayerId { get; set; }

        // ZFT
        [NameInMap("pay_product_code")]
        [Validation(Required=true)]
        public string PayProductCode { get; set; }

        // 交易创建时间
        [NameInMap("gmt_trade_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtTradeCreate { get; set; }

        // 交易支付时间
        [NameInMap("gmt_trade_pay")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtTradePay { get; set; }

        // 交易完成时间
        [NameInMap("gmt_trade_complete")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtTradeComplete { get; set; }

        // 交易状态
        [NameInMap("trade_status")]
        [Validation(Required=false)]
        public string TradeStatus { get; set; }

        // 扩展字段，json串
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
