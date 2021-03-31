// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class PushInsuranceReppolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 直保人租户ID
        [NameInMap("platform_code")]
        [Validation(Required=true, MaxLength=50)]
        public string PlatformCode { get; set; }

        // 直保人
        [NameInMap("direct_insurer_name")]
        [Validation(Required=true, MaxLength=200)]
        public string DirectInsurerName { get; set; }

        // 保单号
        [NameInMap("pol_no")]
        [Validation(Required=true, MaxLength=100)]
        public string PolNo { get; set; }

        // 共保标志，1:是 0:否
        [NameInMap("joint_insurance_logo")]
        [Validation(Required=false, MaxLength=5)]
        public string JointInsuranceLogo { get; set; }

        // 共保比例（%）
        [NameInMap("joint_insurance_rate")]
        [Validation(Required=false, MaxLength=5)]
        public string JointInsuranceRate { get; set; }

        // 险种代码
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=20)]
        public string ProductCode { get; set; }

        // 险种名称
        [NameInMap("product_name")]
        [Validation(Required=true, MaxLength=100)]
        public string ProductName { get; set; }

        // 被保险人
        [NameInMap("bbr_name")]
        [Validation(Required=true, MaxLength=200)]
        public string BbrName { get; set; }

        // 保险起期
        [NameInMap("insure_start")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InsureStart { get; set; }

        // 保险止期
        [NameInMap("insure_end")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string InsureEnd { get; set; }

        // 币种，CNY:人民币, USD:美元，JPY:日元，HKD:港元，EUR:欧元，GBP英镑
        [NameInMap("currency")]
        [Validation(Required=true, MaxLength=10)]
        public string Currency { get; set; }

        // 保费
        [NameInMap("premium")]
        [Validation(Required=true, MaxLength=20)]
        public string Premium { get; set; }

        // 保额
        [NameInMap("insurance_amount")]
        [Validation(Required=false, MaxLength=20)]
        public string InsuranceAmount { get; set; }

        // 固定保额分出比例（%）
        [NameInMap("fixed_insurance_amount_split_rate")]
        [Validation(Required=false, MaxLength=5)]
        public string FixedInsuranceAmountSplitRate { get; set; }

        // 固定保费分出比例（%）
        [NameInMap("fixed_premium_split_rate")]
        [Validation(Required=true, MaxLength=5)]
        public string FixedPremiumSplitRate { get; set; }

        // 临分保额分出比例（%）
        [NameInMap("facultative_insurance_amount_split_rate")]
        [Validation(Required=false, MaxLength=5)]
        public string FacultativeInsuranceAmountSplitRate { get; set; }

        // 临分保费分出比例（%）
        [NameInMap("facultative_premium_split_rate")]
        [Validation(Required=true, MaxLength=5)]
        public string FacultativePremiumSplitRate { get; set; }

        // 分出保费
        [NameInMap("split_premium")]
        [Validation(Required=true, MaxLength=20)]
        public string SplitPremium { get; set; }

        // 再保人
        [NameInMap("reinsurer")]
        [Validation(Required=true, MaxLength=100)]
        public string Reinsurer { get; set; }

        // 摊回手续费比例（%）
        [NameInMap("amortize_fee_rate")]
        [Validation(Required=true, MaxLength=5)]
        public string AmortizeFeeRate { get; set; }

        // 摊回手续费
        [NameInMap("amortize_fee")]
        [Validation(Required=true, MaxLength=20)]
        public string AmortizeFee { get; set; }

        // 再保合同名称
        [NameInMap("reinsurance_contract_name")]
        [Validation(Required=false, MaxLength=200)]
        public string ReinsuranceContractName { get; set; }

        // 是否有超赔临分，1:是 0:否
        [NameInMap("over_pay_facultative")]
        [Validation(Required=false, MaxLength=5)]
        public string OverPayFacultative { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=false, MaxLength=100)]
        public string ProjectName { get; set; }

        // 接收方租户id
        [NameInMap("receiver_platform_id")]
        [Validation(Required=true, MaxLength=50)]
        public string ReceiverPlatformId { get; set; }

    }

}
