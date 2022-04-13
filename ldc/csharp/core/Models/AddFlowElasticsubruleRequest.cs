// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class AddFlowElasticsubruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 消息eventCode, MSGBROKER必填
        [NameInMap("event_code")]
        [Validation(Required=false)]
        public string EventCode { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 父规则ID
        [NameInMap("parent_id")]
        [Validation(Required=true)]
        public long? ParentId { get; set; }

        // 规则值, RPC必填
        [NameInMap("rpc_method")]
        [Validation(Required=false)]
        public string RpcMethod { get; set; }

        // 所属规则类型，可选值：RPC, MSGBROKER, ANTQ, APP
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

        // VALID("线上生效"), PRESS("仅压测生效"), INVALID("无效状态");
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 消息topic, MSGBROKER和ANTQ必填
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // 是否使用默认eid, RPC必填
        [NameInMap("use_default_eid")]
        [Validation(Required=false)]
        public bool? UseDefaultEid { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
