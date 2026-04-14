// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarBatchpubResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 批次ID
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 总设备数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 触发模式
        [NameInMap("trigger_mode")]
        [Validation(Required=false)]
        public string TriggerMode { get; set; }

        // 定时执行时间戳
        [NameInMap("scheduled_time")]
        [Validation(Required=false)]
        public long? ScheduledTime { get; set; }

        // 状态
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

    }

}
