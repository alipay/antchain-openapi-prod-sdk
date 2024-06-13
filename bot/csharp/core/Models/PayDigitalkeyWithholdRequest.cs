// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PayDigitalkeyWithholdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户订单号，需要保证不重复
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 订单标题
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // 签约时支付宝返回的用户ID
        [NameInMap("alipay_user_id")]
        [Validation(Required=true)]
        public string AlipayUserId { get; set; }

        // 销售产品码，商户代扣场景固定为GENERAL_WITHHOLDING
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 商户代扣扣款许可
        [NameInMap("deduct_permission")]
        [Validation(Required=false)]
        public string DeductPermission { get; set; }

        // 代扣协议号, 对应于签约时外部商户传入的协议号
        [NameInMap("external_agreement_no")]
        [Validation(Required=true)]
        public string ExternalAgreementNo { get; set; }

        // 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
        [NameInMap("timeout_express")]
        [Validation(Required=false)]
        public string TimeoutExpress { get; set; }

        // 异步支付类型
        [NameInMap("async_type")]
        [Validation(Required=true)]
        public string AsyncType { get; set; }

        // 可打折金额。 参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]。 如果同时传入了【可打折金额】、【不可打折金额】和【订单总金额】，则必须满足如下条件：【订单总金额】=【可打折金额】+【不可打折金额】。 如果订单金额全部参与优惠计算，则【可打折金额】和【不可打折金额】都无需传入。
        [NameInMap("discountable_amount")]
        [Validation(Required=false)]
        public long? DiscountableAmount { get; set; }

        // 二级商户信息
        [NameInMap("sub_merchant")]
        [Validation(Required=false)]
        public SubMerchantParams SubMerchant { get; set; }

        // 订单附加信息。 如果请求时传递了该参数，将在异步通知、对账单中原样返回，同时会在商户和用户的pc账单详情中作为交易描述展示
        [NameInMap("body")]
        [Validation(Required=false)]
        public string Body { get; set; }

    }

}
