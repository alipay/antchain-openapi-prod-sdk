// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Node affinity is a group of node affinity scheduling rules.
    public class NodeAffinity : TeaModel {
        // The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions
        [NameInMap("preferred_during_scheduling_ignored_during_execution")]
        [Validation(Required=false)]
        public List<PreferredSchedulingTerm> PreferredDuringSchedulingIgnoredDuringExecution { get; set; }

        // If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node
        [NameInMap("required_during_dcheduling_ignored_during_execution")]
        [Validation(Required=true)]
        public NodeSelector RequiredDuringDchedulingIgnoredDuringExecution { get; set; }

    }

}
