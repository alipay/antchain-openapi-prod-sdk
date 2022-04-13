// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateFlowElasticrulestatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 命名空间
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 弹性规则ID列表
        [NameInMap("elastic_rule_ids")]
        [Validation(Required=true)]
        public List<long?> ElasticRuleIds { get; set; }

        // VALID("线上生效"), PRESS("仅压测生效"),  INVALID("无效状态");
        [NameInMap("new_status")]
        [Validation(Required=true)]
        public string NewStatus { get; set; }

    }

}
