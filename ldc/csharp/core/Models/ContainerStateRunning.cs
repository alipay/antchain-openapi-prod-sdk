// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // container state running
    public class ContainerStateRunning : TeaModel {
        // container启动时间
        [NameInMap("started_at")]
        [Validation(Required=true)]
        public string StartedAt { get; set; }

    }

}
