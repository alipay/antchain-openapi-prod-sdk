// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetSidecarTemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // sidecar生效范围：workspace、workspace_group、region
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // sidecar 名称
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // sidecar 版本
        [NameInMap("sidecar_version")]
        [Validation(Required=true)]
        public string SidecarVersion { get; set; }

        // 环境
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // wsg id
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

    }

}
