// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class RetryMachinetaskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 机器 ID
        [NameInMap("machine_id")]
        [Validation(Required=false)]
        public string MachineId { get; set; }

        // retry_info
        [NameInMap("retry_info")]
        [Validation(Required=false)]
        public RetryInfo RetryInfo { get; set; }

        // 任务 ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
