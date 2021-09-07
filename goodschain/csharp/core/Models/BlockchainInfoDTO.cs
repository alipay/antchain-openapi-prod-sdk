// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    // 区块链信息
    public class BlockchainInfoDTO : TeaModel {
        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 交易时间戳
        [NameInMap("tx_time")]
        [Validation(Required=true)]
        public long? TxTime { get; set; }

    }

}
