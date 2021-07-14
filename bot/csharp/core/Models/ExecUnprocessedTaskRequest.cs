// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecUnprocessedTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 任务名称枚举
        // confirm_device_state : 确认设备状态变更
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 任务参数
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

    }

}
