// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // AffinityEntity
    public class AffinityEntity : TeaModel {
        // NodeAffinityConfig list
        [NameInMap("node_affinity")]
        [Validation(Required=false)]
        public List<NodeAffinityConfig> NodeAffinity { get; set; }

        // pod_affinity list
        [NameInMap("pod_affinity")]
        [Validation(Required=false)]
        public List<PodAffinityConfig> PodAffinity { get; set; }

    }

}
