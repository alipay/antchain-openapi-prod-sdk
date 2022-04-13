// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性子规则
    public class ElasticSubRuleView : TeaModel {
        // 弹性子规则ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 所属APP
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 关联的弹性规则ID
        [NameInMap("elastic_rule_id")]
        [Validation(Required=true)]
        public long? ElasticRuleId { get; set; }

        // 父节点
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public long? ParentId { get; set; }

        // 值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 是否使用默认eid，默认 false
        [NameInMap("use_default_eid")]
        [Validation(Required=false)]
        public bool? UseDefaultEid { get; set; }

        // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 规则类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 场景ID
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public long? SceneId { get; set; }

    }

}
