// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ANTVERSE.Models
{
    public class QueryAvatarVideoResponse : TeaModel {
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

        // 视频任务id
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 视频合成任务状态（EXPORTING：导出中，NORMAL：成功，FAILED：失败）
        [NameInMap("video_status")]
        [Validation(Required=false)]
        public string VideoStatus { get; set; }

        // 视频url
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public string VideoUrl { get; set; }

        // 提示消息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
