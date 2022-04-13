// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦无状态工作负载
    public class FederatedDeployment : TeaModel {
        // Standard object metadata.
        // 
        [NameInMap("metadata")]
        [Validation(Required=true)]
        public ObjectMeta Metadata { get; set; }

        // Federated Deployment Override
        [NameInMap("overrides")]
        [Validation(Required=true)]
        public List<FedDeploymentClusterOverride> Overrides { get; set; }

        // Federated Deployment Template
        [NameInMap("template")]
        [Validation(Required=true)]
        public Deployment Template { get; set; }

        // 联邦无状态工作负载状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public FederatedDeploymentStatus Status { get; set; }

    }

}
