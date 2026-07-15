// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class SyncKmDocumentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 树ID
        [NameInMap("tree_id")]
        [Validation(Required=true)]
        public string TreeId { get; set; }

        // 节点ID
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 向量文档ID
        [NameInMap("doc_map_id")]
        [Validation(Required=true)]
        public string DocMapId { get; set; }

    }

}
