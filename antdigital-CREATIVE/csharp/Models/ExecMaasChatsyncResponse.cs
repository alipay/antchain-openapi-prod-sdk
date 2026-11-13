// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class ExecMaasChatsyncResponse : TeaModel {
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

        // 本次模型调用 ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 实际使用的模型
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 完整文本
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 结束原因
        [NameInMap("finish_reason")]
        [Validation(Required=false)]
        public string FinishReason { get; set; }

        // 用量
        [NameInMap("usage")]
        [Validation(Required=false)]
        public ChatUsage Usage { get; set; }

    }

}
