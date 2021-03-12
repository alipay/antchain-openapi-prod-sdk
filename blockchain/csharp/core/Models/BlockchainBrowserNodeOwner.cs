// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链浏览器节点所有者信息
    public class BlockchainBrowserNodeOwner : TeaModel {
        // node_id
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // node_ip
        [NameInMap("node_ip")]
        [Validation(Required=true)]
        public string NodeIp { get; set; }

        // node_name
        [NameInMap("node_name")]
        [Validation(Required=true)]
        public string NodeName { get; set; }

        // node_owner
        [NameInMap("node_owner")]
        [Validation(Required=true)]
        public string NodeOwner { get; set; }

        // node_port
        [NameInMap("node_port")]
        [Validation(Required=true)]
        public string NodePort { get; set; }

        // node_source
        [NameInMap("node_source")]
        [Validation(Required=true)]
        public string NodeSource { get; set; }

        // node_state
        [NameInMap("node_state")]
        [Validation(Required=true)]
        public string NodeState { get; set; }

        // node_type
        [NameInMap("node_type")]
        [Validation(Required=true)]
        public string NodeType { get; set; }

    }

}
