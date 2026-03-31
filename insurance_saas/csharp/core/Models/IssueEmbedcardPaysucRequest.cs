// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class IssueEmbedcardPaysucRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 险种编码
        [NameInMap("insurance_type_code")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceTypeCode { get; set; }

        // 保司编码
        [NameInMap("insurance_company_no")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceCompanyNo { get; set; }

        // 嵌入式产品编码
        [NameInMap("embed_product_code")]
        [Validation(Required=true, MaxLength=32)]
        public string EmbedProductCode { get; set; }

        // 交易流水号
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=128)]
        public string TradeNo { get; set; }

        // 方案名称
        [NameInMap("scheme_name")]
        [Validation(Required=true, MaxLength=32)]
        public string SchemeName { get; set; }

        // 保费，保留2位小数
        [NameInMap("premium")]
        [Validation(Required=true)]
        public string Premium { get; set; }

        // 保费支付渠道，01-支付宝、02-微信支付、03-银行卡支付、04-平台账户余额支付
        [NameInMap("premium_payment_channel")]
        [Validation(Required=true, MaxLength=32)]
        public string PremiumPaymentChannel { get; set; }

        // 保费支付流水号
        [NameInMap("premium_payment_no")]
        [Validation(Required=true, MaxLength=128)]
        public string PremiumPaymentNo { get; set; }

        // 保费支付金额，保留2位小数
        [NameInMap("premium_payment_amount")]
        [Validation(Required=true)]
        public string PremiumPaymentAmount { get; set; }

        // 保费支付时间
        [NameInMap("premium_payment_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PremiumPaymentTime { get; set; }

        // 询价编码
        [NameInMap("inquiry_no")]
        [Validation(Required=true, MaxLength=32)]
        public string InquiryNo { get; set; }

    }

}
