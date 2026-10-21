// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class RetrieveKgGraphRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("kb_id")]
        [Validation(Required=true)]
        public string KbId { get; set; }

        // 限定实体类型集合(逗号分隔)
        [NameInMap("entity_types")]
        [Validation(Required=false)]
        public string EntityTypes { get; set; }

        // 限定关系类型集合(逗号分隔)
        [NameInMap("relation_types")]
        [Validation(Required=false)]
        public string RelationTypes { get; set; }

        // 是否包含孤立节点
        [NameInMap("show_isolated")]
        [Validation(Required=false)]
        public bool? ShowIsolated { get; set; }

        // 是否包含锚点节点
        [NameInMap("include_anchors")]
        [Validation(Required=false)]
        public bool? IncludeAnchors { get; set; }

    }

}
