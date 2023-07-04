// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class QueryOpsplanNodetreeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发布单id
        [NameInMap("ops_plan_id")]
        [Validation(Required=true)]
        public string OpsPlanId { get; set; }

        // 发布单节点树根节点id
        [NameInMap("sub_tree_node_root_id")]
        [Validation(Required=false)]
        public string SubTreeNodeRootId { get; set; }

    }

}
