// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class DetachPolicyRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 授权对象Id
        [NameInMap("actor_id")]
        [Validation(Required=true)]
        public string ActorId { get; set; }

        // 授权对象类型
        [NameInMap("actor_type")]
        [Validation(Required=true)]
        public string ActorType { get; set; }

        // 授权策略Id
        [NameInMap("policy_id")]
        [Validation(Required=true)]
        public string PolicyId { get; set; }

    }

}
