// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class DetachPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 授权对象Id
        [NameInMap("actor_id")]
        [Validation(Required=false)]
        public string ActorId { get; set; }

        // 授权对象类型
        [NameInMap("actor_type")]
        [Validation(Required=false)]
        public string ActorType { get; set; }

        // 授权策略Id
        [NameInMap("policy_id")]
        [Validation(Required=false)]
        public string PolicyId { get; set; }

        // 授权操作员的登录名，当配置actor_id与actor_type时可不填
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 授权策略的唯一名称，当配置policy_id时可不填
        [NameInMap("policy_name")]
        [Validation(Required=false)]
        public string PolicyName { get; set; }

    }

}
