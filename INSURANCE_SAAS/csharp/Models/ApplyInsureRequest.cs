// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class ApplyInsureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 投保申请号-外部，业务侧需保证唯一
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

        // 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
        [NameInMap("applicant")]
        [Validation(Required=true)]
        public string Applicant { get; set; }

        // 被保人列表(可空)，json格式参见投保人信息
        [NameInMap("insured_list")]
        [Validation(Required=false)]
        public string InsuredList { get; set; }

        // 受益人列表(可空)
        [NameInMap("beneficiary_list")]
        [Validation(Required=false)]
        public string BeneficiaryList { get; set; }

        // 保险起期
        [NameInMap("insurance_period_start")]
        [Validation(Required=true)]
        public string InsurancePeriodStart { get; set; }

        // 保险止期
        [NameInMap("insurance_period_end")]
        [Validation(Required=false)]
        public string InsurancePeriodEnd { get; set; }

        // 申请保额，支持多币种， { "cent": 10000, "currency": "CNY" }
        [NameInMap("applied_insurance_amount")]
        [Validation(Required=true)]
        public string AppliedInsuranceAmount { get; set; }

        // 保期，单位：天
        [NameInMap("insurance_period")]
        [Validation(Required=false)]
        public long? InsurancePeriod { get; set; }

        // 投保标的List，动态字段，根据险种所配置的标的传值
        [NameInMap("insured_object_list")]
        [Validation(Required=false)]
        public string InsuredObjectList { get; set; }

    }

}
