// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class AddFlowElasticruleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // MSGBROKER 需要填写。
        // 弹性规则消息类型事件码。
        // 如果包含所有eventCode，可以用英文星号"*"表示。
        [NameInMap("event_codes")]
        [Validation(Required=false)]
        public List<string> EventCodes { get; set; }

        // 弹性规则方法名称，RPC类型需要填写。
        // 如果包含所有方法，则填写英文星号"*"
        [NameInMap("methods")]
        [Validation(Required=false)]
        public List<string> Methods { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 弹性规则类型，包括：APP、RPC、MSGBROKER，ANTQ
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

        // 适用的弹性场景名称
        [NameInMap("scene_name")]
        [Validation(Required=true)]
        public string SceneName { get; set; }

        // 弹性规则服务名称。
        // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
        // APP：对应应用名，例如：cif。
        // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 弹性规则状态，有效值：VALID（线上生效）、PRESS（仅压测生效）、INVALID（无效状态）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // MSGBROKER 和 ANTQ 需要填写。
        // 弹性规则消息类型topic。
        // 如果包含所有topic，可以用英文星号"*"表示。
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // 是否使用默认EID（默认 false）
        [NameInMap("use_default_eid")]
        [Validation(Required=false)]
        public bool? UseDefaultEid { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
