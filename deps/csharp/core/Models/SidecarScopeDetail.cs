// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // sidecar生效范围详情
    public class SidecarScopeDetail : TeaModel {
        // sidecar生效范围：workspace、workspace_group、region	
        // 
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // scope对应的唯一id，例如workspace对应workspace id	
        // 
        [NameInMap("scope_identity")]
        [Validation(Required=false)]
        public string ScopeIdentity { get; set; }

        // scope identity展示名称
        [NameInMap("scope_identity_display_name")]
        [Validation(Required=false)]
        public string ScopeIdentityDisplayName { get; set; }

        // scope对应的唯一标识符
        [NameInMap("scope_identity_name")]
        [Validation(Required=false)]
        public string ScopeIdentityName { get; set; }

    }

}
