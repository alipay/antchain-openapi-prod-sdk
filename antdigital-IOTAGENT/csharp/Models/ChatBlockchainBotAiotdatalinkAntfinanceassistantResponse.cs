// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse : TeaModel {
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

        // 会话ID,多轮场景需要回传
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 扩展参数（JSON 字符串）
        [NameInMap("ext_params")]
        [Validation(Required=false)]
        public string ExtParams { get; set; }

        // 本轮对话唯一ID
        [NameInMap("chat_id")]
        [Validation(Required=false)]
        public string ChatId { get; set; }

        // 响应文本
        [NameInMap("response")]
        [Validation(Required=false)]
        public string Response { get; set; }

        // 回复置信度分数
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

        // 响应标题
        [NameInMap("response_title")]
        [Validation(Required=false)]
        public string ResponseTitle { get; set; }

        // 回复生效的条件
        [NameInMap("response_condition")]
        [Validation(Required=false)]
        public string ResponseCondition { get; set; }

    }

}
