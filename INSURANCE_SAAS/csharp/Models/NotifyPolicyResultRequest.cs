// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class NotifyPolicyResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 蚂蚁承保申请号
        [NameInMap("insurance_application_no_inner")]
        [Validation(Required=true)]
        public string InsuranceApplicationNoInner { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 保额，JSON格式
        [NameInMap("insurance_amount")]
        [Validation(Required=true)]
        public string InsuranceAmount { get; set; }

        // 保费,json格式
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
