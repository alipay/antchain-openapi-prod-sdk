// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    // 区块信息
    public class BlockInfo : TeaModel {
        // 块高度
        [NameInMap("block_height")]
        [Validation(Required=true)]
        public long? BlockHeight { get; set; }

        // 成块时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 交易摘要
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
