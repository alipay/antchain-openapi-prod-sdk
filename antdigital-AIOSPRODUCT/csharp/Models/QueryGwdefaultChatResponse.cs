// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIOSPRODUCT.Models
{
    public class QueryGwdefaultChatResponse : TeaModel {
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

        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 业务配置标识（必传），决定模型、策略、提示词
        [NameInMap("agent_code")]
        [Validation(Required=false)]
        public string AgentCode { get; set; }

        // 回答
        [NameInMap("answer")]
        [Validation(Required=false)]
        public string Answer { get; set; }

        // 链路id
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 附加信息
        [NameInMap("metadata")]
        [Validation(Required=false)]
        public string Metadata { get; set; }

    }

}
