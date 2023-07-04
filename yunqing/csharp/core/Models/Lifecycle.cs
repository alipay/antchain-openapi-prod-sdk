// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用生命周期
    public class Lifecycle : TeaModel {
        // 存活探针
        [NameInMap("liveness")]
        [Validation(Required=false)]
        public ProbeConfig Liveness { get; set; }

        // readiness
        [NameInMap("readiness")]
        [Validation(Required=false)]
        public ProbeConfig Readiness { get; set; }

        // preStop
        [NameInMap("pre_stop")]
        [Validation(Required=false)]
        public ProbeConfig PreStop { get; set; }

        // postStart
        [NameInMap("post_start")]
        [Validation(Required=false)]
        public ProbeConfig PostStart { get; set; }

        // startUp
        [NameInMap("start_up")]
        [Validation(Required=false)]
        public ProbeConfig StartUp { get; set; }

        // entrypoint
        [NameInMap("entrypoint")]
        [Validation(Required=false)]
        public ProbeConfig Entrypoint { get; set; }

    }

}
