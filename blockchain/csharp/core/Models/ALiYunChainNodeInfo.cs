// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云链节点信息
    public class ALiYunChainNodeInfo : TeaModel {
        // block_height
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // node_name
        [NameInMap("node_name")]
        [Validation(Required=false)]
        public string NodeName { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public bool? Status { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
