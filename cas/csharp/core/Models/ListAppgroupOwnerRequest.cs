// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListAppgroupOwnerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户查询
        [NameInMap("query")]
        [Validation(Required=true)]
        public UserQuery Query { get; set; }

        // 占位
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
