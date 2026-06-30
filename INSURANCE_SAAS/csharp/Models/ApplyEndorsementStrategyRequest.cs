// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class ApplyEndorsementStrategyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 承保申请编号（蚂蚁内部）
        [NameInMap("insurance_application_no_inner")]
        [Validation(Required=true)]
        public string InsuranceApplicationNoInner { get; set; }

        // 投保人信息(名称、证件号、证件类型)
        [NameInMap("applicant")]
        [Validation(Required=false)]
        public string Applicant { get; set; }

        // 被保人列表
        [NameInMap("insured_list")]
        [Validation(Required=false)]
        public string InsuredList { get; set; }

        // 受益人列表
        [NameInMap("beneficiary_list")]
        [Validation(Required=false)]
        public string BeneficiaryList { get; set; }

        // 投保标的列表
        [NameInMap("object_list")]
        [Validation(Required=false)]
        public string ObjectList { get; set; }

        // 保险起期 yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_period_start")]
        [Validation(Required=false)]
        public string InsurancePeriodStart { get; set; }

        // 保险止期 yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_period_end")]
        [Validation(Required=false)]
        public string InsurancePeriodEnd { get; set; }

        // 保期（天）
        [NameInMap("insurance_period")]
        [Validation(Required=false)]
        public long? InsurancePeriod { get; set; }

        // 申请保额， { "cent": 20000, "currency": "CNY" }
        [NameInMap("applied_insurance_amount")]
        [Validation(Required=false)]
        public string AppliedInsuranceAmount { get; set; }

        // 保费， { "cent": 20000, "currency": "CNY" }
        [NameInMap("applied_premium")]
        [Validation(Required=false)]
        public string AppliedPremium { get; set; }

        // 保费费率
        [NameInMap("premium_rate")]
        [Validation(Required=false)]
        public string PremiumRate { get; set; }

    }

}
