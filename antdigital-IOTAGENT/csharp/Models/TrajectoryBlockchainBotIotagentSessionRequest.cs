// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class TrajectoryBlockchainBotIotagentSessionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体ID
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 会话ID
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 作用域类型 TURNS|CONTEXT_OPERATIONS，默认 TURNS
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 分页游标，首次为空
        [NameInMap("cursor")]
        [Validation(Required=false)]
        public string Cursor { get; set; }

        // 每页大小 1-50，默认 20
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 诊断标签过滤，逗号分隔
        [NameInMap("diagnostics")]
        [Validation(Required=false)]
        public string Diagnostics { get; set; }

        // 关键词搜索，最长100字
        [NameInMap("keyword")]
        [Validation(Required=false)]
        public string Keyword { get; set; }

        // 排序 NONE|DURATION|TOKENS
        [NameInMap("top_by")]
        [Validation(Required=false)]
        public string TopBy { get; set; }

    }

}
