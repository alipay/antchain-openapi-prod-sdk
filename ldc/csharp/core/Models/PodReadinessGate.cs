// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // PodReadinessGate contains the reference to a pod condition
    public class PodReadinessGate : TeaModel {
        // ConditionType refers to a condition in the pod_s condition list with matching type.
        [NameInMap("condition_type")]
        [Validation(Required=true)]
        public string ConditionType { get; set; }

    }

}
