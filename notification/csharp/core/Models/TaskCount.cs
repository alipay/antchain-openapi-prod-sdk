// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NOTIFICATION.Models
{
    // 任务统计
    public class TaskCount : TeaModel {
        // 总数量
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 成功数量
        [NameInMap("success_count")]
        [Validation(Required=true)]
        public long? SuccessCount { get; set; }

        // 处理中的数量
        [NameInMap("processing_count")]
        [Validation(Required=true)]
        public long? ProcessingCount { get; set; }

        // 失败数量
        [NameInMap("failure_count")]
        [Validation(Required=true)]
        public long? FailureCount { get; set; }

    }

}
