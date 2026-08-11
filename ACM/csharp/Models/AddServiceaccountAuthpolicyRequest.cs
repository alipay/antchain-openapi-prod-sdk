// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class AddServiceaccountAuthpolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 服务账号对应的AccessKey
        [NameInMap("iam_access_key")]
        [Validation(Required=true)]
        public string IamAccessKey { get; set; }

        // 系统来源
        [NameInMap("source_system")]
        [Validation(Required=true)]
        public string SourceSystem { get; set; }

        // 能力ID（权限点或角色ID）
        [NameInMap("ability_id")]
        [Validation(Required=true)]
        public string AbilityId { get; set; }

        // 授权能力类型
        [NameInMap("ability_type")]
        [Validation(Required=true)]
        public string AbilityType { get; set; }

        // 授权策略的限制条件
        // 
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<Condition> Conditions { get; set; }

    }

}
