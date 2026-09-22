// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class QueryAntcloudMarketingagentCreativeVideoResponse : TeaModel {
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

        // 视频任务 ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // PENDING、PROCESSING、COMPLETED、FAILED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 视频产物列表
        [NameInMap("outputs")]
        [Validation(Required=false)]
        public List<VideoOutput> Outputs { get; set; }

        // 扩写后的脚本，上游提供时返回
        [NameInMap("script")]
        [Validation(Required=false)]
        public string Script { get; set; }

        // 视频耗费credits
        [NameInMap("credits")]
        [Validation(Required=false)]
        public string Credits { get; set; }

        // 任务失败原因
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

    }

}
