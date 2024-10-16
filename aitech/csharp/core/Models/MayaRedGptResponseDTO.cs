// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // maya响应体
    public class MayaRedGptResponseDTO : TeaModel {
        // 消息的ID
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 应答内容
        [NameInMap("answer")]
        [Validation(Required=true)]
        public string Answer { get; set; }

        // 应答内容格式
        [NameInMap("answer_format")]
        [Validation(Required=true)]
        public string AnswerFormat { get; set; }

        // 是否回答结束
        [NameInMap("answer_end")]
        [Validation(Required=true)]
        public bool? AnswerEnd { get; set; }

        // 是否问题有风险
        [NameInMap("safe")]
        [Validation(Required=true)]
        public bool? Safe { get; set; }

    }

}
