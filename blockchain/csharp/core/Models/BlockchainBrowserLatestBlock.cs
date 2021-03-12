// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链最新区块列表信息
    public class BlockchainBrowserLatestBlock : TeaModel {
        // bizid
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // height
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // previous_hash
        [NameInMap("previous_hash")]
        [Validation(Required=true)]
        public string PreviousHash { get; set; }

        // root_tx_hash
        [NameInMap("root_tx_hash")]
        [Validation(Required=true)]
        public string RootTxHash { get; set; }

        // size
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // transaction_size
        [NameInMap("transaction_size")]
        [Validation(Required=true)]
        public long? TransactionSize { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

    }

}
