// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 调度任务关联的机房信息
    public class TaskIdc : TeaModel {
        // 机房id
        [NameInMap("idc_id")]
        [Validation(Required=false)]
        public string IdcId { get; set; }

        // 机房执行状态
        [NameInMap("task_state")]
        [Validation(Required=false)]
        public string TaskState { get; set; }

    }

}
