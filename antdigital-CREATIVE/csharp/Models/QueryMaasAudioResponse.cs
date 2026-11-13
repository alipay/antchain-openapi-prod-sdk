// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class QueryMaasAudioResponse : TeaModel {
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

        // 音频任务 ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 任务状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 实际使用的模型
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 创建时间，Unix 秒级时间戳
        [NameInMap("created_at")]
        [Validation(Required=false)]
        public string CreatedAt { get; set; }

        // 音频信息
        [NameInMap("content")]
        [Validation(Required=false)]
        public List<AudioList> Content { get; set; }

        // 用量
        [NameInMap("usage")]
        [Validation(Required=false)]
        public List<AudioUsage> Usage { get; set; }

        // 非标准化补充信息，JSON 字符串
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 失败时返回
        [NameInMap("error")]
        [Validation(Required=false)]
        public Error Error { get; set; }

    }

}
