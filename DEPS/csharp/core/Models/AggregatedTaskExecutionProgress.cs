// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 聚合任务执行进度
    public class AggregatedTaskExecutionProgress : TeaModel {
        // 错误节点信息
        [NameInMap("error_task_execution_nodes")]
        [Validation(Required=false)]
        public List<ErrorTaskExecutionNode> ErrorTaskExecutionNodes { get; set; }

        // 任务执行进度
        [NameInMap("task_execution_progress")]
        [Validation(Required=false)]
        public TaskExecutionProgress TaskExecutionProgress { get; set; }

    }

}
