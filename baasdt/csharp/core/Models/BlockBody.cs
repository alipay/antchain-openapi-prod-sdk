// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 区块体
    public class BlockBody : TeaModel {
        // 区块共识证明(HEX)
        [NameInMap("consensus_proof")]
        [Validation(Required=true)]
        public string ConsensusProof { get; set; }

        // 区块中交易回执列表
        [NameInMap("receipt_list")]
        [Validation(Required=true)]
        public List<BlockReceipt> ReceiptList { get; set; }

        // 区块中交易列表
        [NameInMap("transaction_list")]
        [Validation(Required=true)]
        public List<BlockTransaction> TransactionList { get; set; }

    }

}
