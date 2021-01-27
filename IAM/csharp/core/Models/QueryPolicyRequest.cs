// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class QueryPolicyRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 授权对象id
        [NameInMap("actor_id")]
        [Validation(Required=true)]
        public string ActorId { get; set; }

        // 授权对象类型
        [NameInMap("actor_type")]
        [Validation(Required=true)]
        public string ActorType { get; set; }

        // 当前页，默认值为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public int? PageNum { get; set; }

        // 分页大小，默认值为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        // 授权策略所属租户
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
