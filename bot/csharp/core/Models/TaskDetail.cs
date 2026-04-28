// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 批量定时任务详情
    public class TaskDetail : TeaModel {
        // 批次id
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // tuid
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // device_name
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 调用时间
        [NameInMap("invoke_time")]
        [Validation(Required=false)]
        public long? InvokeTime { get; set; }

        // 错误信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 重试次数
        [NameInMap("retry_count")]
        [Validation(Required=false)]
        public long? RetryCount { get; set; }

    }

}
