// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // The deployment strategy to use to replace existing pods with new ones.
    public class DeploymentStrategy : TeaModel {
        // Rolling update config params. Present only if DeploymentStrategyType = RollingUpdate.
        [NameInMap("rolling_update")]
        [Validation(Required=false)]
        public RollingUpdateDeployment RollingUpdate { get; set; }

        // Type of deployment. Can be "Recreate" or "RollingUpdate". Default is RollingUpdate.
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
