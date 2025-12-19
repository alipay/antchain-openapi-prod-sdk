// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ORG.Models
{
    // 权益智能体会话消息对象
    public class AgentSessionMessageData : TeaModel {
        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 消息编号
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 对话请求内容
        [NameInMap("request")]
        [Validation(Required=true)]
        public string Request { get; set; }

        // 对话响应内容
        [NameInMap("response")]
        [Validation(Required=true)]
        public string Response { get; set; }

        // 对话状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 会话结果(错误)信息
        [NameInMap("result_msg")]
        [Validation(Required=true)]
        public string ResultMsg { get; set; }

        // 卡片编辑的业务数据
        [NameInMap("custom_data")]
        [Validation(Required=true)]
        public string CustomData { get; set; }

        // 卡片编辑后的内容
        [NameInMap("custom_response")]
        [Validation(Required=true)]
        public string CustomResponse { get; set; }

        // 是否可编辑
        [NameInMap("editable")]
        [Validation(Required=true)]
        public bool? Editable { get; set; }

    }

}
