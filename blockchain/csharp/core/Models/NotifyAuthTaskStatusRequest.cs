// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class NotifyAuthTaskStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 支uid
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // NO_START, NO_SUBMIT, NOT_COMPLETE, COMPLETE
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 状态发生时间
        [NameInMap("happen_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string HappenTime { get; set; }

    }

}
