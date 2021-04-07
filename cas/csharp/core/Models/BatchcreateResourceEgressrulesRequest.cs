// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class BatchcreateResourceEgressrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 安全组出方向规则
        [NameInMap("egress_rules")]
        [Validation(Required=true)]
        public List<SecurityGroupRule> EgressRules { get; set; }

        // region identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 安全组id
        [NameInMap("security_group_id")]
        [Validation(Required=true)]
        public string SecurityGroupId { get; set; }

    }

}
