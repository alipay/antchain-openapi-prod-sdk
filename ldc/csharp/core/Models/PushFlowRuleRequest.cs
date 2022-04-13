// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class PushFlowRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 包含系统列表
        [NameInMap("apps")]
        [Validation(Required=false)]
        public List<string> Apps { get; set; }

        // 是否灰度（默认 false）
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 站点是否全局推送
        [NameInMap("push_all")]
        [Validation(Required=false)]
        public bool? PushAll { get; set; }

        // 规则类型,支持(ZONE_INFO,ELASTIC_BIZ_RULE,ZONE_COLOR,TAO_BAO_RULE)
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

        // 规则文本
        [NameInMap("rule_value")]
        [Validation(Required=true)]
        public string RuleValue { get; set; }

        // 全量的targets信息
        [NameInMap("targets")]
        [Validation(Required=false)]
        public List<string> Targets { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 是否覆盖其他应用的规则，默认 false
        [NameInMap("override")]
        [Validation(Required=false)]
        public bool? Override { get; set; }

    }

}
