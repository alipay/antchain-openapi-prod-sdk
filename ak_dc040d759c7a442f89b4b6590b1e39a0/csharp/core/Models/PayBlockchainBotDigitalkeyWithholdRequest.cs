// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    public class PayBlockchainBotDigitalkeyWithholdRequest : TeaModel {
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

        // 代扣协议号, 对应于签约时，支付宝返回的协议
        [NameInMap("agreement_no")]
        [Validation(Required=true)]
        public string AgreementNo { get; set; }

        // 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
        [NameInMap("timeout_express")]
        [Validation(Required=false)]
        public string TimeoutExpress { get; set; }

        // 异步支付类型
        [NameInMap("async_type")]
        [Validation(Required=true)]
        public string AsyncType { get; set; }

    }

}
