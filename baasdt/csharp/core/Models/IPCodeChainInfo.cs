// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 区块链信息
    public class IPCodeChainInfo : TeaModel {
        // 交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 交易区块
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 交易时间
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public long? TxTime { get; set; }

    }

}
