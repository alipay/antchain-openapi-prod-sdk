// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNICONTACT.Models
{
    // 场景构建结果体
    public class StrategyUploadResult : TeaModel {
        // 元数据id
        [NameInMap("rule_meta_id")]
        [Validation(Required=true)]
        public long? RuleMetaId { get; set; }

        // 场景id
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public long? SceneId { get; set; }

        // 租户场景id
        [NameInMap("tenant_scene_id")]
        [Validation(Required=true)]
        public long? TenantSceneId { get; set; }

        // 圈客规则id
        [NameInMap("decision_rule_id")]
        [Validation(Required=true)]
        public long? DecisionRuleId { get; set; }

        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

    }

}
