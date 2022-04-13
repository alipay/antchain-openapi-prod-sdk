// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Deployment PodTemplateSpec
    public class PodTemplateSpec : TeaModel {
        // k8s Standard object_s metadata. 
        [NameInMap("metadata")]
        [Validation(Required=true)]
        public ObjectMeta Metadata { get; set; }

        // Specification of the desired behavior of the pod.
        [NameInMap("spec")]
        [Validation(Required=true)]
        public PodSpec Spec { get; set; }

    }

}
