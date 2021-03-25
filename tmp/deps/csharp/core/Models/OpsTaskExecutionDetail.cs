// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // OpsTaskExecutionDetail
    public class OpsTaskExecutionDetail : TeaModel {
        // task_id
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // request_token
        [NameInMap("request_token")]
        [Validation(Required=false)]
        public string RequestToken { get; set; }

        // node_id
        [NameInMap("node_id")]
        [Validation(Required=false)]
        public string NodeId { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // execution_count
        [NameInMap("execution_count")]
        [Validation(Required=false)]
        public long? ExecutionCount { get; set; }

        // executionState
        [NameInMap("execution_state")]
        [Validation(Required=false)]
        public string ExecutionState { get; set; }

        // target_id
        [NameInMap("target_id")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

        // error_code
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // result_msg
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // startedTime
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string StartedTime { get; set; }

        // finished_time
        [NameInMap("finished_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string FinishedTime { get; set; }

        // standalone_executable
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
