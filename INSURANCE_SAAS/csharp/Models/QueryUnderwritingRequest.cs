// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryUnderwritingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 承保申请号（蚂蚁内部）
        [NameInMap("insurance_application_no_inner")]
        [Validation(Required=true)]
        public string InsuranceApplicationNoInner { get; set; }

    }

}
