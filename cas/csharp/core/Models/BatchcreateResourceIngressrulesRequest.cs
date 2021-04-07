// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class BatchcreateResourceIngressrulesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 安全组入口规则
        [NameInMap("ingress_rules")]
        [Validation(Required=true)]
        public List<SecurityGroupRule> IngressRules { get; set; }

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
