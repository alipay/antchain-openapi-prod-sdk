// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryPolicyFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 蚂蚁侧保单唯一ID
        [NameInMap("insurance_policy_no_inner")]
        [Validation(Required=true)]
        public string InsurancePolicyNoInner { get; set; }

    }

}
