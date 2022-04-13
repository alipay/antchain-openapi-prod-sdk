// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // DeploymentStatus
    public class DeploymentStatus : TeaModel {
        // Total number of available pods (ready for at least minReadySeconds) targeted by this deployment.
        // 
        [NameInMap("available_replicas")]
        [Validation(Required=true)]
        public long? AvailableReplicas { get; set; }

        // Represents the latest available observations of a deployment_s current state.
        // 
        [NameInMap("conditions")]
        [Validation(Required=true)]
        public List<DeploymentCondition> Conditions { get; set; }

        // The generation observed by the deployment controller.
        // 
        [NameInMap("observed_generation")]
        [Validation(Required=false)]
        public long? ObservedGeneration { get; set; }

        // Total number of ready pods targeted by this deployment.
        // 
        [NameInMap("ready_replicas")]
        [Validation(Required=true)]
        public long? ReadyReplicas { get; set; }

        // Total number of non-terminated pods targeted by this deployment (their labels match the selector).
        // 
        [NameInMap("replicas")]
        [Validation(Required=true)]
        public long? Replicas { get; set; }

        // Total number of unavailable pods targeted by this deployment. 
        [NameInMap("unavailable_replicas")]
        [Validation(Required=true)]
        public long? UnavailableReplicas { get; set; }

        // Total number of non-terminated pods targeted by this deployment that have the desired template spec.
        [NameInMap("updated_replicas")]
        [Validation(Required=true)]
        public long? UpdatedReplicas { get; set; }

    }

}
