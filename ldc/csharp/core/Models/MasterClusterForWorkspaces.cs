// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // MasterClusterForWorkspaces
    public class MasterClusterForWorkspaces : TeaModel {
        // workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public List<string> WorkspaceId { get; set; }

        // master cluster info to init minion cluster
        [NameInMap("master_cluster_info")]
        [Validation(Required=true)]
        public MasterCluster MasterClusterInfo { get; set; }

    }

}
