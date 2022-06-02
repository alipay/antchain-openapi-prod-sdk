// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 树节点
    public class TreeNode : TeaModel {
        // 节点id，按树的前序排列
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 父节点id，不存在为null
        [NameInMap("parent_node_id")]
        [Validation(Required=true)]
        public string ParentNodeId { get; set; }

        // 深度
        [NameInMap("depth")]
        [Validation(Required=true)]
        public long? Depth { get; set; }

        // 是否叶子结点
        [NameInMap("is_leef_node")]
        [Validation(Required=true)]
        public string IsLeefNode { get; set; }

        // 模版
        [NameInMap("card")]
        [Validation(Required=true)]
        public Card Card { get; set; }

    }

}
