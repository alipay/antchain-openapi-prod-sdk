// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class SubmitInquiryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // inquiryNo
        [NameInMap("inquiry_no")]
        [Validation(Required=true)]
        public string InquiryNo { get; set; }

        // 询价平台
        [NameInMap("inquire_platform")]
        [Validation(Required=true)]
        public string InquirePlatform { get; set; }

        // 单次保额
        [NameInMap("single_insurance_amount")]
        [Validation(Required=true)]
        public string SingleInsuranceAmount { get; set; }

        // 总保额
        [NameInMap("total_insurance_amount")]
        [Validation(Required=true)]
        public string TotalInsuranceAmount { get; set; }

        // 询价基础材料列表
        [NameInMap("material_list")]
        [Validation(Required=false)]
        public string MaterialList { get; set; }

        // 询价标的列表
        [NameInMap("object_list")]
        [Validation(Required=false)]
        public string ObjectList { get; set; }

        // 保司编号
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

        // 询价人(名称、证件号、证件类型)
        [NameInMap("inquirer")]
        [Validation(Required=true)]
        public string Inquirer { get; set; }

        // 投保人(可空)
        [NameInMap("applicant")]
        [Validation(Required=false)]
        public string Applicant { get; set; }

        // 被保人列表(可空)
        [NameInMap("insured_list")]
        [Validation(Required=false)]
        public string InsuredList { get; set; }

    }

}
