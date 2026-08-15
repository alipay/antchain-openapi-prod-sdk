// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIOSPRODUCT.Models
{
    public class QueryGwchildinsuranceChatRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户标识
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 租户标识
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务配置标识（必传），决定模型、策略、提示词
        [NameInMap("agent_code")]
        [Validation(Required=true)]
        public string AgentCode { get; set; }

        // 用户输入
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 会话标识（可选），新会话不传，继续会话传
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 扩展字段（可选），用于后端服务直接调用时指定技术参数
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 标签过滤字段（可选），用于按标签过滤生效的 expertAgents/skills/tools
        [NameInMap("tag_info")]
        [Validation(Required=false)]
        public string TagInfo { get; set; }

    }

}
