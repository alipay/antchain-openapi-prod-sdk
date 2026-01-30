// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS_DE.Models
{
    public class UploadInsurglobifyprodMonthlypremiumbillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 保司编码
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalChannelCode { get; set; }

        // 险种编码
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalProductCode { get; set; }

        // 保险方案名
        [NameInMap("ch_scheme_name")]
        [Validation(Required=true, MaxLength=20)]
        public string ChSchemeName { get; set; }

        // 关联的大保单号
        [NameInMap("big_pol_no")]
        [Validation(Required=true, MaxLength=200)]
        public string BigPolNo { get; set; }

        // 账单年度
        [NameInMap("billing_year")]
        [Validation(Required=true, MaxLength=4)]
        public string BillingYear { get; set; }

        // 账单月份
        [NameInMap("billing_month")]
        [Validation(Required=true, MaxLength=2)]
        public string BillingMonth { get; set; }

        // 包裹总数
        [NameInMap("package_count")]
        [Validation(Required=true, MaxLength=256)]
        public string PackageCount { get; set; }

        // 净保费，小数位只支持2位
        [NameInMap("premium")]
        [Validation(Required=true, MaxLength=20)]
        public string Premium { get; set; }

        // 税费，小数位只支持2位
        [NameInMap("taxa_amount")]
        [Validation(Required=true, MaxLength=20)]
        public string TaxaAmount { get; set; }

        // 总保费（含税费），小数位只支持2位
        [NameInMap("total_premium")]
        [Validation(Required=true, MaxLength=20)]
        public string TotalPremium { get; set; }

        // 币种，使用ISO 4217代码；
        // CNY：人民币
        // USD：美元
        // EUR：欧元
        // GBP：英镑
        // JPY：日元
        // CHF：瑞士法郎
        // SGD：新加坡元
        [NameInMap("currency")]
        [Validation(Required=true, MaxLength=3)]
        public string Currency { get; set; }

    }

}
