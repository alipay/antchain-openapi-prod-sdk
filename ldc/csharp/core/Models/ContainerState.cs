// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // container state
    public class ContainerState : TeaModel {
        // container running state
        [NameInMap("running")]
        [Validation(Required=true)]
        public ContainerStateRunning Running { get; set; }

        // container terminated state
        [NameInMap("terminated")]
        [Validation(Required=true)]
        public ContainerStateTerminated Terminated { get; set; }

        // container waiting state
        [NameInMap("waiting")]
        [Validation(Required=true)]
        public ContainerStateWaiting Waiting { get; set; }

    }

}
