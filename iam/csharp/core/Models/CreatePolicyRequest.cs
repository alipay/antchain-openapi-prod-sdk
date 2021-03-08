// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class CreatePolicyRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 角色Id
        [NameInMap("ability_id")]
        [Validation(Required=true)]
        public string AbilityId { get; set; }

        // 授权能力类型（ROLE：角色)
        [NameInMap("ability_type")]
        [Validation(Required=true)]
        public string AbilityType { get; set; }

        // 授权策略的限制条件
        [NameInMap("conditons")]
        [Validation(Required=false)]
        public List<Condition> Conditons { get; set; }

        // 策略的描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 授权策略名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 八位租户ID
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
