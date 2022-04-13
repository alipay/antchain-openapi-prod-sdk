// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class InitMulticlusterClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // federation namespace
        [NameInMap("fed_namespace")]
        [Validation(Required=false)]
        public string FedNamespace { get; set; }

        // master cluster info 
        [NameInMap("master_cluster_info")]
        [Validation(Required=true)]
        public List<MasterCluster> MasterClusterInfo { get; set; }

        // workspace group name
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
