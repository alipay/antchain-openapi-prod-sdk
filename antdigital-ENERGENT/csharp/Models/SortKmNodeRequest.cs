// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class SortKmNodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("tree_id")]
        [Validation(Required=true)]
        public string TreeId { get; set; }

        // 父节点ID(空为顶层)
        [NameInMap("parent_node_id")]
        [Validation(Required=false)]
        public string ParentNodeId { get; set; }

        // 按新顺序排列的节点ID(逗号分隔)
        [NameInMap("node_ids")]
        [Validation(Required=true)]
        public string NodeIds { get; set; }

    }

}
