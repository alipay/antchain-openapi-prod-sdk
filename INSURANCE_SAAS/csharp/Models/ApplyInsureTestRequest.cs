// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class ApplyInsureTestRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // insurance_application_no
        [NameInMap("insurance_application_no")]
        [Validation(Required=true)]
        public string InsuranceApplicationNo { get; set; }

        // insurance_company_no
        [NameInMap("insurance_company_no")]
        [Validation(Required=true)]
        public string InsuranceCompanyNo { get; set; }

        // trustworthy_value_insurance_type_code
        [NameInMap("trustworthy_value_insurance_type_code")]
        [Validation(Required=true)]
        public string TrustworthyValueInsuranceTypeCode { get; set; }

        // insurance_project_code
        [NameInMap("insurance_project_code")]
        [Validation(Required=true)]
        public string InsuranceProjectCode { get; set; }

        // insurance_options_code
        [NameInMap("insurance_options_code")]
        [Validation(Required=true)]
        public string InsuranceOptionsCode { get; set; }

        // applicant
        [NameInMap("applicant")]
        [Validation(Required=true)]
        public string Applicant { get; set; }

        // insured_list
        [NameInMap("insured_list")]
        [Validation(Required=false)]
        public string InsuredList { get; set; }

        // beneficiary_list
        [NameInMap("beneficiary_list")]
        [Validation(Required=false)]
        public string BeneficiaryList { get; set; }

        // insurance_period_start
        [NameInMap("insurance_period_start")]
        [Validation(Required=true)]
        public string InsurancePeriodStart { get; set; }

        // insurance_period_end
        [NameInMap("insurance_period_end")]
        [Validation(Required=false)]
        public string InsurancePeriodEnd { get; set; }

        // applied_insurance_amount
        [NameInMap("applied_insurance_amount")]
        [Validation(Required=true)]
        public string AppliedInsuranceAmount { get; set; }

        // insurance_period
        [NameInMap("insurance_period")]
        [Validation(Required=false)]
        public string InsurancePeriod { get; set; }

        // insured_object_list
        [NameInMap("insured_object_list")]
        [Validation(Required=false)]
        public string InsuredObjectList { get; set; }

    }

}
