// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持节点
    public class TransparentProxyNodeModel : TeaModel {
        // ip地址
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // 节点类型
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

        // 节点ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

    }

}
