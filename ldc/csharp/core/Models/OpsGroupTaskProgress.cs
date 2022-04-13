// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 发布|运维分组执行进度
    public class OpsGroupTaskProgress : TeaModel {
        // 任务码
        [NameInMap("action_code")]
        [Validation(Required=true)]
        public string ActionCode { get; set; }

        // 任务名称
        [NameInMap("action_name")]
        [Validation(Required=true)]
        public string ActionName { get; set; }

        // 任务状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 任务开始时间
        [NameInMap("started_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartedTime { get; set; }

        // 任务结束时间
        [NameInMap("finished_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FinishedTime { get; set; }

    }

}
