// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 弹性规则
    public class ElasticRuleView : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 弹性类型，有效值：SERVICE，MSGBROKER
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 弹性值
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 关联应用
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 状态，有效值：VALID（线上生效），PRESS（仅压测生效），INVALID（无效状态）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 场景 ID
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public long? SceneId { get; set; }

    }

}
