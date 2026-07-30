// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerMermngcontractextractResponse : TeaModel {
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

        // 任务code
        [NameInMap("task_code")]
        [Validation(Required=false)]
        public string TaskCode { get; set; }

        // 任务id
        [NameInMap("task_instant_id")]
        [Validation(Required=false)]
        public string TaskInstantId { get; set; }

        // 业务id
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 任务实例状态 PROCESSING/SUCCESS/FAILED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 提取结果
        [NameInMap("extract_result")]
        [Validation(Required=false)]
        public string ExtractResult { get; set; }

    }

}
