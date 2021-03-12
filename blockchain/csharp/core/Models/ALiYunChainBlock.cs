// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链区块信息
    public class ALiYunChainBlock : TeaModel {
        // ant_chain_id
        [NameInMap("ant_chain_id")]
        [Validation(Required=false)]
        public string AntChainId { get; set; }

        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // height
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // previous_hash
        [NameInMap("previous_hash")]
        [Validation(Required=false)]
        public string PreviousHash { get; set; }

        // root_tx_hash
        [NameInMap("root_tx_hash")]
        [Validation(Required=false)]
        public string RootTxHash { get; set; }

        // transaction_size
        [NameInMap("transaction_size")]
        [Validation(Required=false)]
        public long? TransactionSize { get; set; }

        // trans_summary_list
        [NameInMap("trans_summary_list")]
        [Validation(Required=false)]
        public List<ALiYunTransactionSummary> TransSummaryList { get; set; }

        // Version
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

    }

}
