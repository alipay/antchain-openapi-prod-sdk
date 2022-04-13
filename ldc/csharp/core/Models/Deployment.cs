// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // k8s v1Deployment
    public class Deployment : TeaModel {
        // Standard object metadata.
        // 
        [NameInMap("metadata")]
        [Validation(Required=true)]
        public ObjectMeta Metadata { get; set; }

        // Specification of the desired behavior of the Deployment.
        // 
        [NameInMap("spec")]
        [Validation(Required=true)]
        public DeploymentSpec Spec { get; set; }

        // Most recently observed status of the Deployment.
        // 
        [NameInMap("status")]
        [Validation(Required=true)]
        public DeploymentStatus Status { get; set; }

    }

}
