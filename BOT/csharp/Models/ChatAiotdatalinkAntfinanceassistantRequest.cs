// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ChatAiotdatalinkAntfinanceassistantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝用户UID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 语言
        [NameInMap("language")]
        [Validation(Required=true)]
        public string Language { get; set; }

        // 用户/会话维度的扩展信息，JSON对应类型：map<string,string>
        [NameInMap("user_info_map")]
        [Validation(Required=true)]
        public string UserInfoMap { get; set; }

        // 透传扩展参数，JSON对应类型：map<string,string>
        [NameInMap("ext_params")]
        [Validation(Required=true)]
        public string ExtParams { get; set; }

        // 科技板块怎么样
        [NameInMap("user_query")]
        [Validation(Required=true)]
        public string UserQuery { get; set; }

        // query 类型，枚举（手输：user_input、语音输入：voice_input、sug点击：card_click）
        [NameInMap("query_type")]
        [Validation(Required=true)]
        public string QueryType { get; set; }

        // 会话 ID，用于上下文延续
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 引用的上一轮 chatId（上下文引用，可空）
        [NameInMap("ref_chat_id")]
        [Validation(Required=false)]
        public string RefChatId { get; set; }

    }

}
