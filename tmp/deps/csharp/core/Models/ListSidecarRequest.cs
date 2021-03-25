// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class ListSidecarRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分页请求体
        [NameInMap("pagination_query")]
        [Validation(Required=false)]
        public PaginationQuery PaginationQuery { get; set; }

        // sidecar生效范围：workspace、workspace_group、region
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // scope对应的唯一标识符
        [NameInMap("scope_identity")]
        [Validation(Required=false)]
        public string ScopeIdentity { get; set; }

    }

}
