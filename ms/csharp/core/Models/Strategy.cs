// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 调度策略
    public class Strategy : TeaModel {
        // 调度策略名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 关联的调度任务数
        [NameInMap("related_task_count")]
        [Validation(Required=false)]
        public int? RelatedTaskCount { get; set; }

    }

}
