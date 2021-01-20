// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class RetryGrayTaskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 进程 ID
        [NameInMap("process_id")]
        [Validation(Required=false)]
        public string ProcessId { get; set; }

        // retry_info
        [NameInMap("retry_info")]
        [Validation(Required=false)]
        public RetryInfo RetryInfo { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
