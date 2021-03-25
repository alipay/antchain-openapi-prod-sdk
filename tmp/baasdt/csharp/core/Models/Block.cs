// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 区块
    public class Block : TeaModel {
        // 区块头
        [NameInMap("header")]
        [Validation(Required=true)]
        public BlockHeader Header { get; set; }

        // 区块体
        [NameInMap("body")]
        [Validation(Required=true)]
        public BlockBody Body { get; set; }

    }

}
