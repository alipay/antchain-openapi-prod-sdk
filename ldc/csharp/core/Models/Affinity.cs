// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Affinity is a group of affinity scheduling rules.
    public class Affinity : TeaModel {
        // Describes node affinity scheduling rules for the pod.
        // 
        [NameInMap("node_affinity")]
        [Validation(Required=false)]
        public NodeAffinity NodeAffinity { get; set; }

        // Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
        [NameInMap("pod_affinity")]
        [Validation(Required=false)]
        public PodAffinity PodAffinity { get; set; }

        // Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
        // 
        [NameInMap("pod_anti_affinity")]
        [Validation(Required=false)]
        public PodAntiAffinity PodAntiAffinity { get; set; }

    }

}
