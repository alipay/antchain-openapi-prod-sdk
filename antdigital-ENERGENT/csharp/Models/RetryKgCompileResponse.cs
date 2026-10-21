// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class RetryKgCompileResponse : TeaModel {
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

        // 编译任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 知识库ID
        [NameInMap("kb_id")]
        [Validation(Required=false)]
        public string KbId { get; set; }

        // 关联文档ID
        [NameInMap("document_id")]
        [Validation(Required=false)]
        public string DocumentId { get; set; }

        // 任务状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 已重试次数
        [NameInMap("retry_count")]
        [Validation(Required=false)]
        public long? RetryCount { get; set; }

        // 任务进度
        [NameInMap("progress")]
        [Validation(Required=false)]
        public long? Progress { get; set; }

        // 失败原因
        [NameInMap("failed_reason")]
        [Validation(Required=false)]
        public string FailedReason { get; set; }

    }

}
