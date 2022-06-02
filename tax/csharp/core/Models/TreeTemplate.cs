// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // TreeTemplate
    public class TreeTemplate : TeaModel {
        // 树节点
        [NameInMap("tree_node")]
        [Validation(Required=true)]
        public TreeNode TreeNode { get; set; }

        // Id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 向上兼容的最小版本号
        [NameInMap("compatible_min_version")]
        [Validation(Required=true)]
        public string CompatibleMinVersion { get; set; }

    }

}
