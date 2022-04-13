// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // deployment strategy rolling update
    public class RollingUpdateDeployment : TeaModel {
        // The maximum number of pods that can be scheduled above the desired number of pods.
        [NameInMap("max_surge")]
        [Validation(Required=false)]
        public string MaxSurge { get; set; }

        // The maximum number of pods that can be unavailable during the update.
        [NameInMap("max_unavailable")]
        [Validation(Required=false)]
        public string MaxUnavailable { get; set; }

    }

}
