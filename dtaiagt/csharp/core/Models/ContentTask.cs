// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 知识库-任务列表对象
    public class ContentTask : TeaModel {
        // 任务ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 任务名称
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // 任务类型
        [NameInMap("task_type")]
        [Validation(Required=true)]
        public string TaskType { get; set; }

        // 任务状态:
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
