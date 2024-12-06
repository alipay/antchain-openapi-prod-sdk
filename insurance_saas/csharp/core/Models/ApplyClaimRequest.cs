// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class ApplyClaimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 报案单号
        [NameInMap("claim_notification_form_no")]
        [Validation(Required=true)]
        public string ClaimNotificationFormNo { get; set; }

        // 保单号
        [NameInMap("insurance_policy_no")]
        [Validation(Required=true)]
        public string InsurancePolicyNo { get; set; }

        // 保司编号
        [NameInMap("insurance_company_no")]
        [Validation(Required=true)]
        public string InsuranceCompanyNo { get; set; }

        // 保险产品代码
        [NameInMap("trustworthy_value_insurance_type_code")]
        [Validation(Required=false)]
        public string TrustworthyValueInsuranceTypeCode { get; set; }

        // 保司项目代码
        [NameInMap("insurance_options_code")]
        [Validation(Required=false)]
        public string InsuranceOptionsCode { get; set; }

        //  保司项目代码
        [NameInMap("insurance_project_code")]
        [Validation(Required=false)]
        public string InsuranceProjectCode { get; set; }

        // 出险时间
        [NameInMap("loss_occurred_time")]
        [Validation(Required=true)]
        public string LossOccurredTime { get; set; }

        // 出险原因
        [NameInMap("loss_occurred_reason")]
        [Validation(Required=true)]
        public string LossOccurredReason { get; set; }

        // 出险地点
        [NameInMap("loss_occurred_address")]
        [Validation(Required=true)]
        public string LossOccurredAddress { get; set; }

        // 出险标的列表
        [NameInMap("object_list")]
        [Validation(Required=false)]
        public string ObjectList { get; set; }

        // 报案金额
        [NameInMap("claim_notification_amount_local_currency")]
        [Validation(Required=true)]
        public string ClaimNotificationAmountLocalCurrency { get; set; }

        // 报案人
        [NameInMap("reporter")]
        [Validation(Required=true)]
        public string Reporter { get; set; }

        // 报案材料列表
        [NameInMap("material_list")]
        [Validation(Required=false)]
        public string MaterialList { get; set; }

    }

}
