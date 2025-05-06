// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryReverseCommissionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 案件号-外部唯一
        [NameInMap("out_case_no")]
        [Validation(Required=true)]
        public string OutCaseNo { get; set; }

        // 委托的保司ID
        [NameInMap("entrust_insurance_company_id")]
        [Validation(Required=true)]
        public string EntrustInsuranceCompanyId { get; set; }

    }

}
