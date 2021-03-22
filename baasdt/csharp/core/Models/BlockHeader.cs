// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 区块头
    public class BlockHeader : TeaModel {
        // gas总消耗
        [NameInMap("gas_used")]
        [Validation(Required=true)]
        public long? GasUsed { get; set; }

        // 十六进制区块哈希值
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // log bloom
        [NameInMap("log_bloom")]
        [Validation(Required=true)]
        public string LogBloom { get; set; }

        // 区块高度
        [NameInMap("number")]
        [Validation(Required=true)]
        public long? Number { get; set; }

        // 十六进制区块父hash
        [NameInMap("parent_hash")]
        [Validation(Required=true)]
        public string ParentHash { get; set; }

        // 交易单据树根
        [NameInMap("receipt_root")]
        [Validation(Required=true)]
        public string ReceiptRoot { get; set; }

        // 状态树根
        [NameInMap("state_root")]
        [Validation(Required=true)]
        public string StateRoot { get; set; }

        // 区块时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 十六进制交易merkle树根
        [NameInMap("transaction_root")]
        [Validation(Required=true)]
        public string TransactionRoot { get; set; }

        // 区块版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

    }

}
