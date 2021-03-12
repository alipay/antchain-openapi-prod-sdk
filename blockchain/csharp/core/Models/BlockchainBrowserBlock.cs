// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链浏览器区块信息
    public class BlockchainBrowserBlock : TeaModel {
        // bizid
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // blockchain_name
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // blockchain_status
        [NameInMap("blockchain_status")]
        [Validation(Required=true)]
        public bool? BlockchainStatus { get; set; }

        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // hash_status
        [NameInMap("hash_status")]
        [Validation(Required=true)]
        public bool? HashStatus { get; set; }

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

        // transaction_list
        [NameInMap("transaction_list")]
        [Validation(Required=true)]
        public List<BlockchainBrowserTransaction> TransactionList { get; set; }

        // transaction_size
        [NameInMap("transaction_size")]
        [Validation(Required=true)]
        public long? TransactionSize { get; set; }

    }

}
