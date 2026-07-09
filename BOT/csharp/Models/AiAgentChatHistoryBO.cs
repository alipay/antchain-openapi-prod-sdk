// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 会话内容
    public class AiAgentChatHistoryBO : TeaModel {
        // 客户端ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>00:ba:cc</para>
        /// </summary>
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 客户端类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>ESP32</para>
        /// </summary>
        [NameInMap("client_type")]
        [Validation(Required=true)]
        public string ClientType { get; set; }

        // 对话内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>...对话内容</para>
        /// </summary>
        [NameInMap("conversation_content")]
        [Validation(Required=true)]
        public string ConversationContent { get; set; }

        // 对话类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>request</para>
        /// </summary>
        [NameInMap("conversation_type")]
        [Validation(Required=true)]
        public string ConversationType { get; set; }

        // 会话ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7468486322254688256</para>
        /// </summary>
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 对话时间（格式化后的时间）
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-06-24 21:32:59</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

    }

}
