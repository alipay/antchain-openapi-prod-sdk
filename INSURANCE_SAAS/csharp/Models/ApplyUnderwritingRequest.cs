// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class ApplyUnderwritingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 报价单编号（蚂蚁内部）
        [NameInMap("quotation_no_inner")]
        [Validation(Required=false)]
        public string QuotationNoInner { get; set; }

        // 承保申请号（保司）
        [NameInMap("insurance_application_no")]
        [Validation(Required=true)]
        public string InsuranceApplicationNo { get; set; }

        // 保司编码
        [NameInMap("insurance_company_no")]
        [Validation(Required=true)]
        public string InsuranceCompanyNo { get; set; }

        // 保险产品编码
        [NameInMap("trustworthy_value_insurance_type_code")]
        [Validation(Required=true)]
        public string TrustworthyValueInsuranceTypeCode { get; set; }

        // 保司项目代码
        [NameInMap("insurance_project_code")]
        [Validation(Required=true)]
        public string InsuranceProjectCode { get; set; }

        // 保司方案代码
        [NameInMap("insurance_options_code")]
        [Validation(Required=true)]
        public string InsuranceOptionsCode { get; set; }

        // 投保人信息(名称、证件号、证件类型)
        [NameInMap("applicant")]
        [Validation(Required=true)]
        public string Applicant { get; set; }

        // 被保人列表(可空)
        [NameInMap("insured_list")]
        [Validation(Required=false)]
        public string InsuredList { get; set; }

        // 受益人列表(可空)
        [NameInMap("beneficiary_list")]
        [Validation(Required=false)]
        public string BeneficiaryList { get; set; }

        // 投保标的列表
        [NameInMap("object_list")]
        [Validation(Required=false)]
        public string ObjectList { get; set; }

        // 保险起期 yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_period_start")]
        [Validation(Required=true)]
        public string InsurancePeriodStart { get; set; }

        // 保险止期 yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_period_end")]
        [Validation(Required=false)]
        public string InsurancePeriodEnd { get; set; }

        // 保期（天）
        [NameInMap("insurance_period")]
        [Validation(Required=true)]
        public long? InsurancePeriod { get; set; }

        // 申请保额， {
        // 		"cent": 20000,
        // 		"currency": "CNY"
        // 	}
        [NameInMap("applied_insurance_amount")]
        [Validation(Required=true)]
        public string AppliedInsuranceAmount { get; set; }

        // 保费
        [NameInMap("applied_premium")]
        [Validation(Required=true)]
        public string AppliedPremium { get; set; }

        // 保费费率
        [NameInMap("premium_rate")]
        [Validation(Required=true)]
        public string PremiumRate { get; set; }

        // 承保申请的报价相关内容
        [NameInMap("quotation")]
        [Validation(Required=false)]
        public string Quotation { get; set; }

    }

}
