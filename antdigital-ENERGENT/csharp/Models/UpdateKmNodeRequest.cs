// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class UpdateKmNodeRequest : TeaModel {
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

        // 节点ID
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点键名
        [NameInMap("slot_key")]
        [Validation(Required=false)]
        public string SlotKey { get; set; }

        // 节点值
        [NameInMap("slot_value")]
        [Validation(Required=false)]
        public string SlotValue { get; set; }

    }

}
