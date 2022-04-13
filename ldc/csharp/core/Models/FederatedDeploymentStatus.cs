// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Federated Deployment Status
    public class FederatedDeploymentStatus : TeaModel {
        // Federated Deployment Conditions
        [NameInMap("conditions")]
        [Validation(Required=true)]
        public List<DeploymentCondition> Conditions { get; set; }

        // V1FederatedDeploymentStatus Topologies
        [NameInMap("topologies")]
        [Validation(Required=true)]
        public List<FederatedDeploymentStatusTopologies> Topologies { get; set; }

    }

}
