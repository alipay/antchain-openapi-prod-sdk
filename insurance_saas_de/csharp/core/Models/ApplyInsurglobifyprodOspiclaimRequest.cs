// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS_DE.Models
{
    public class ApplyInsurglobifyprodOspiclaimRequest : TeaModel {
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

        // 大保单号
        [NameInMap("big_pol_no")]
        [Validation(Required=true, MaxLength=100)]
        public string BigPolNo { get; set; }

        // 投保订单号
        [NameInMap("rela_order_no")]
        [Validation(Required=true, MaxLength=200)]
        public string RelaOrderNo { get; set; }

        // 受损货物名称
        [NameInMap("damaged_cargo_name")]
        [Validation(Required=true, MaxLength=100)]
        public string DamagedCargoName { get; set; }

        // 出险原因
        [NameInMap("incident_cause")]
        [Validation(Required=true, MaxLength=50)]
        public string IncidentCause { get; set; }

        // 出险日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        [NameInMap("accident_time")]
        [Validation(Required=true, MaxLength=50)]
        public string AccidentTime { get; set; }

        // 销售日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        [NameInMap("sale_date")]
        [Validation(Required=true, MaxLength=50)]
        public string SaleDate { get; set; }

        // 时区
        // Asia/Shanghai
        // Europe/Berlin
        // America/New_York
        // Pacific/Auckland
        // Europe/Berlin 
        [NameInMap("timezone")]
        [Validation(Required=true, MaxLength=20)]
        public string Timezone { get; set; }

        // 索赔状态（Open / Under Review / In Payment Process / Closed / Rejected / Cancelled）
        [NameInMap("claim_status")]
        [Validation(Required=true, MaxLength=20)]
        public string ClaimStatus { get; set; }

        // 货物大类
        [NameInMap("cargo_type")]
        [Validation(Required=true, MaxLength=256)]
        public string CargoType { get; set; }

        // 平台赔付日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        [NameInMap("claim_paid_time")]
        [Validation(Required=true, MaxLength=50)]
        public string ClaimPaidTime { get; set; }

        // 索赔类别(Valid / Fraudulent / Invalid
        [NameInMap("claim_category")]
        [Validation(Required=true, MaxLength=20)]
        public string ClaimCategory { get; set; }

        // 索赔被拒原因
        [NameInMap("claim_paid_desc")]
        [Validation(Required=true, MaxLength=256)]
        public string ClaimPaidDesc { get; set; }

        // 索赔总金额，小数位只支持2位
        [NameInMap("claim_paid_amount")]
        [Validation(Required=true, MaxLength=20)]
        public string ClaimPaidAmount { get; set; }

        // 币种，使用ISO 4217代码；
        // CNY：人民币
        // USD：美元
        // EUR：欧元
        // GBP：英镑
        // JPY：日元
        // CHF：瑞士法郎
        // SGD：新加坡元
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 索赔事件类型(Loss / Theft / Breakage / Non-Delivery）
        [NameInMap("claim_incident_type")]
        [Validation(Required=true, MaxLength=20)]
        public string ClaimIncidentType { get; set; }

        // 索赔事件详情情况
        [NameInMap("claim_verdict_desc")]
        [Validation(Required=true, MaxLength=526)]
        public string ClaimVerdictDesc { get; set; }

    }

}
