// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // container state terminated
    public class ContainerStateTerminated : TeaModel {
        // container id
        [NameInMap("container_id")]
        [Validation(Required=true)]
        public string ContainerId { get; set; }

        // exit code
        [NameInMap("exit_code")]
        [Validation(Required=true)]
        public long? ExitCode { get; set; }

        // container结束时间
        [NameInMap("finished_at")]
        [Validation(Required=true)]
        public string FinishedAt { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // reason
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // signal
        [NameInMap("signal")]
        [Validation(Required=true)]
        public string Signal { get; set; }

        // container start time
        [NameInMap("started_at")]
        [Validation(Required=true)]
        public string StartedAt { get; set; }

    }

}
