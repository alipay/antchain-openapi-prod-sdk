// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateSidecarRulestatusRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

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
        public long? Status { get; set; }

        // 发布、下线、废弃原因
        [NameInMap("status_reason")]
        [Validation(Required=false)]
        public string StatusReason { get; set; }

    }

}
