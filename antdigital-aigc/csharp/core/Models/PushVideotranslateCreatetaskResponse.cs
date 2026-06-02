// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    public class PushVideotranslateCreatetaskResponse : TeaModel {
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

        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public long? TaskId { get; set; }

        // 任务名称
        [NameInMap("task_name")]
        [Validation(Required=false)]
        public string TaskName { get; set; }

        // 子任务数量
        [NameInMap("sub_task_count")]
        [Validation(Required=false)]
        public long? SubTaskCount { get; set; }

        // 任务状态：PENDING-待执行、EXECUTING-执行中、COMPLETED-已完成
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
