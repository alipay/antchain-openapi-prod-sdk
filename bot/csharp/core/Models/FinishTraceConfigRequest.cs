// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class FinishTraceConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 私有化端唯一标识
        [NameInMap("unique_num")]
        [Validation(Required=true)]
        public string UniqueNum { get; set; }

        // 私有化端配置成功标志
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 任务信息，用于消费者回告
        [NameInMap("task_info")]
        [Validation(Required=true)]
        public TaskInfo TaskInfo { get; set; }

    }

}
