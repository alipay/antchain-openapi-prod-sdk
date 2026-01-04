// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话历史列表
    public class SingleAgentChatHistoryPreview : TeaModel {
        // 数据库id
        // 
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 会话id
        // 
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 会话开始时间
        // 
        [NameInMap("ask_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AskTime { get; set; }

        // 前端展示的时间
        // 
        [NameInMap("display_time")]
        [Validation(Required=true)]
        public string DisplayTime { get; set; }

        // 会话在列表中的显示内容
        // 
        [NameInMap("session_identifier")]
        [Validation(Required=true)]
        public string SessionIdentifier { get; set; }

        // 消息类型（chat/pushMessage）
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 推送的消息内容
        // 
        [NameInMap("text_response")]
        [Validation(Required=true)]
        public string TextResponse { get; set; }

        // 推送时间
        // 
        [NameInMap("timestamp_display")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TimestampDisplay { get; set; }

        // 返回类型
        // 
        [NameInMap("display_response_type")]
        [Validation(Required=true)]
        public string DisplayResponseType { get; set; }

        // 附件文件
        // 
        [NameInMap("files")]
        [Validation(Required=true)]
        public List<AttachFile> Files { get; set; }

    }

}
