// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 区块链信息
    public class BlockchainDTO : TeaModel {
        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 当前块高
        [NameInMap("block_number")]
        [Validation(Required=true)]
        public long? BlockNumber { get; set; }

    }

}
