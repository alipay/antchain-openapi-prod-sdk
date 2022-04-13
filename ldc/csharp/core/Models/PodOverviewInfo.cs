// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Pod Overview Info
    public class PodOverviewInfo : TeaModel {
        // pod number
        [NameInMap("pod_number")]
        [Validation(Required=false)]
        public long? PodNumber { get; set; }

        // unhealthy pod number
        [NameInMap("unhealthy_pod_number")]
        [Validation(Required=false)]
        public long? UnhealthyPodNumber { get; set; }

    }

}
