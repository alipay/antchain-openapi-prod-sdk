// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 链节点信息
    public class NodeInfo : TeaModel {
        // 链的区块高度
        [NameInMap("blockheight")]
        [Validation(Required=false)]
        public long? Blockheight { get; set; }

        // 节点名称
        [NameInMap("nodename")]
        [Validation(Required=false)]
        public string Nodename { get; set; }

        // 节点健康状况
        [NameInMap("status")]
        [Validation(Required=false)]
        public bool? Status { get; set; }

        // 节点版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
