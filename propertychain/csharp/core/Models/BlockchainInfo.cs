// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 区块链信息
    public class BlockchainInfo : TeaModel {
        // hash值
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 时间戳
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public long? TxTime { get; set; }

    }

}
