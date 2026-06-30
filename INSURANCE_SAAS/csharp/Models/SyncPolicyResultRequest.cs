// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class SyncPolicyResultRequest : TeaModel {
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

        // 被保人列表(可空)
        [NameInMap("insured_list")]
        [Validation(Required=false)]
        public string InsuredList { get; set; }

        // 受益人列表(可空)
        [NameInMap("beneficiary_list")]
        [Validation(Required=false)]
        public string BeneficiaryList { get; set; }

        // 投保标的List，动态字段，根据险种所配置的标的传值
        [NameInMap("object_list")]
        [Validation(Required=true)]
        public string ObjectList { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 保额，JSON格式
        [NameInMap("insurance_amount")]
        [Validation(Required=true)]
        public string InsuranceAmount { get; set; }

        // 保费,json格式
        // 
        [NameInMap("insurance_premium")]
        [Validation(Required=true)]
        public string InsurancePremium { get; set; }

        // 保险起期 yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_period_start")]
        [Validation(Required=true)]
        public string InsurancePeriodStart { get; set; }

        // 保险止期 yyyy-MM-dd HH:mm:ss
        [NameInMap("insurance_period_end")]
        [Validation(Required=true)]
        public string InsurancePeriodEnd { get; set; }

        // 电子保单URL
        [NameInMap("policy_url")]
        [Validation(Required=false)]
        public string PolicyUrl { get; set; }

    }

}
