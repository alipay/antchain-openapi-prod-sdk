// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链浏览器交易信息
    public class BlockchainBrowserTransaction : TeaModel {
        // bizid
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // category
        [NameInMap("category")]
        [Validation(Required=true)]
        public long? Category { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // gas_used
        [NameInMap("gas_used")]
        [Validation(Required=true)]
        public long? GasUsed { get; set; }

        // hash
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // height
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // reference_count
        [NameInMap("reference_count")]
        [Validation(Required=true)]
        public long? ReferenceCount { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // transaction_type
        [NameInMap("transaction_type")]
        [Validation(Required=true)]
        public string TransactionType { get; set; }

        // block_version
        [NameInMap("block_version")]
        [Validation(Required=true)]
        public long? BlockVersion { get; set; }

        // blockchain_name
        [NameInMap("blockchain_name")]
        [Validation(Required=true)]
        public string BlockchainName { get; set; }

        // blockchain_status
        [NameInMap("blockchain_status")]
        [Validation(Required=true)]
        public bool? BlockchainStatus { get; set; }

        // content
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // hash_status
        [NameInMap("hash_status")]
        [Validation(Required=true)]
        public bool? HashStatus { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // transaction_contract
        [NameInMap("transaction_contract")]
        [Validation(Required=true)]
        public BlockchainBrowserTransactionContract TransactionContract { get; set; }

    }

}
