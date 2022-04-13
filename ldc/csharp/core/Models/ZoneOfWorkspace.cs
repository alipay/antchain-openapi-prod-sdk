// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // zone list of workspace
    public class ZoneOfWorkspace : TeaModel {
        // workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // workspace name
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // zone list of workspace
        [NameInMap("zones")]
        [Validation(Required=true)]
        public List<ZoneInfo> Zones { get; set; }

        // region name
        [NameInMap("region_name")]
        [Validation(Required=true)]
        public string RegionName { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

    }

}
