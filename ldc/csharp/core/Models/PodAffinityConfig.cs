// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // PodAffinityConfigEntity
    public class PodAffinityConfig : TeaModel {
        // anti_affinity
        [NameInMap("anti_affinity")]
        [Validation(Required=false)]
        public bool? AntiAffinity { get; set; }

        // pod_affinity_term
        [NameInMap("pod_affinity_term")]
        [Validation(Required=false)]
        public PodAffinityTermEntity PodAffinityTerm { get; set; }

        // requested
        [NameInMap("requested")]
        [Validation(Required=false)]
        public bool? Requested { get; set; }

        // weight
        [NameInMap("weight")]
        [Validation(Required=false)]
        public long? Weight { get; set; }

    }

}
