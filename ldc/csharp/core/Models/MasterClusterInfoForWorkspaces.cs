// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // MasterClusterInfoForWorkspaces
    public class MasterClusterInfoForWorkspaces : TeaModel {
        // master cluster info
        [NameInMap("master_cluster_info")]
        [Validation(Required=true)]
        public MasterCluster MasterClusterInfo { get; set; }

        // workspace ids
        [NameInMap("workspace_ids")]
        [Validation(Required=true)]
        public List<string> WorkspaceIds { get; set; }

    }

}
