// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateSidecarRuleRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 规则描述	
        // 
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 规则优先级
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

        // sidecar生效范围：workspace、workspace_group、region	
        // 
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // scope对应的唯一标识，例如workspace对应workspace id	
        // 
        [NameInMap("scope_identity")]
        [Validation(Required=false)]
        public string ScopeIdentity { get; set; }

        // sidecar版本实例id
        [NameInMap("sidecar_version_instance_id")]
        [Validation(Required=false)]
        public string SidecarVersionInstanceId { get; set; }

        // 规则状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
