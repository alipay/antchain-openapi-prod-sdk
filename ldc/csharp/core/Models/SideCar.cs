// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar元数据
    public class SideCar : TeaModel {
        // region id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // sidecar description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // sidecar生效范围：workspace、workspace_group、region
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // sidecar_name
        [NameInMap("sidecar_name")]
        [Validation(Required=true)]
        public string SidecarName { get; set; }

        // workspace_group_id
        [NameInMap("workspace_group_id")]
        [Validation(Required=false)]
        public string WorkspaceGroupId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
