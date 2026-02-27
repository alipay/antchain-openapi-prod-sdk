// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATCS.Models
{
    // 任务结果
    public class TaskResult : TeaModel {
        // 任务标识
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 任务状态，PENDING/待处理，PROGRESS/进行中，COMPLETED/已完成，FAILED/失败，CANCELED/已取消
        [NameInMap("task_status")]
        [Validation(Required=true)]
        public string TaskStatus { get; set; }

        // 任务提交时间
        [NameInMap("task_submit_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TaskSubmitTime { get; set; }

        // 交易hash，链上查询使用
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
