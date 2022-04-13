// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // V1WeightedPodAffinityTerm
    public class WeightedPodAffinityTerm : TeaModel {
        // Pod Affinity Term
        [NameInMap("pod_affinity_term")]
        [Validation(Required=true)]
        public PodAffinityTerm PodAffinityTerm { get; set; }

        // weight
        [NameInMap("weight")]
        [Validation(Required=true)]
        public long? Weight { get; set; }

    }

}
