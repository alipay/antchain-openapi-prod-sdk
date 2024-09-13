// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 批量发送任务结果
    public class BatchSendTaskData : TeaModel {
        // 批量发送任务id
        [NameInMap("batch_task_id")]
        [Validation(Required=true)]
        public string BatchTaskId { get; set; }

    }

}
