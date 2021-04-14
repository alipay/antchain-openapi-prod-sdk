// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账号标识，可弃用
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 支付宝交易金额
        [NameInMap("alipay_order_amount")]
        [Validation(Required=true)]
        public long? AlipayOrderAmount { get; set; }

        // 支付宝订单号
        [NameInMap("alipay_order_no")]
        [Validation(Required=true)]
        public string AlipayOrderNo { get; set; }

        // 支付宝交易总金额
        [NameInMap("alipay_order_total_amount")]
        [Validation(Required=true)]
        public long? AlipayOrderTotalAmount { get; set; }

        // 免押金额
        [NameInMap("deposit_waive_amount")]
        [Validation(Required=true)]
        public long? DepositWaiveAmount { get; set; }

        // 订单总保额，单位分，insured为True时必填
        [NameInMap("insurance_coverage")]
        [Validation(Required=false)]
        public long? InsuranceCoverage { get; set; }

        // 保单号，insured为True时必填，仅支持数字和字母
        [NameInMap("insurance_order_no")]
        [Validation(Required=false)]
        public string InsuranceOrderNo { get; set; }

        // 商品名称
        [NameInMap("item_name")]
        [Validation(Required=true)]
        public string ItemName { get; set; }

        // 商品市场价格
        [NameInMap("item_price")]
        [Validation(Required=true)]
        public long? ItemPrice { get; set; }

        // 商品类目
        [NameInMap("item_type")]
        [Validation(Required=true)]
        public string ItemType { get; set; }

        // 商户支付宝账号
        [NameInMap("merchant_alipay_account")]
        [Validation(Required=true)]
        public string MerchantAlipayAccount { get; set; }

        // 商户支付宝ID
        [NameInMap("merchant_alipay_id")]
        [Validation(Required=true)]
        public string MerchantAlipayId { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 商户单号
        [NameInMap("merchant_order_no")]
        [Validation(Required=false)]
        public string MerchantOrderNo { get; set; }

        // 支付渠道，包括支付宝（Alipay）、第三方收单机构（ThirdParty）、信用卡（CreditCard）、银行转账（BankTransfer）、微信（WeChatPay）、其他（Other）
        [NameInMap("payment_channel")]
        [Validation(Required=false)]
        public string PaymentChannel { get; set; }

        // 租约结束日期
        [NameInMap("tenancy_term_end")]
        [Validation(Required=true)]
        public long? TenancyTermEnd { get; set; }

        // 租约起始日期
        [NameInMap("tenancy_term_start")]
        [Validation(Required=true)]
        public long? TenancyTermStart { get; set; }

        // 是否投保，默认为True
        [NameInMap("insured")]
        [Validation(Required=false)]
        public bool? Insured { get; set; }

        // 保单查询地址，insured为True时必填
        [NameInMap("insurance_order_url")]
        [Validation(Required=false)]
        public string InsuranceOrderUrl { get; set; }

        // 保险缴费单号，insured为True时必填，仅支持数字和字母，长度20
        [NameInMap("insurance_bill_no")]
        [Validation(Required=false)]
        public string InsuranceBillNo { get; set; }

        // 保险缴费北京时间，格式为"YYYYMMDDHHMISS"，时区为UTC+8
        [NameInMap("insurance_bill_time")]
        [Validation(Required=false)]
        public string InsuranceBillTime { get; set; }

        // 保险缴费金额，单位分
        [NameInMap("insurance_bill_amount")]
        [Validation(Required=false)]
        public long? InsuranceBillAmount { get; set; }

        // 订单产品保额，单位分，insured为True时必填
        [NameInMap("insurance_product_coverage")]
        [Validation(Required=false)]
        public long? InsuranceProductCoverage { get; set; }

    }

}
