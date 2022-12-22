// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    // 区块链交易信息
    public class BlockChainTransactionInfo : TeaModel {
        // 区块链上交易哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 区块链标识
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 消耗gas数量
        [NameInMap("gas_used")]
        [Validation(Required=true)]
        public string GasUsed { get; set; }

        // 父区块哈希
        [NameInMap("parent_hash")]
        [Validation(Required=true)]
        public string ParentHash { get; set; }

        // 收据根
        [NameInMap("receipt_root")]
        [Validation(Required=true)]
        public string ReceiptRoot { get; set; }

        // 状态树根
        [NameInMap("state_root")]
        [Validation(Required=true)]
        public string StateRoot { get; set; }

        // 交易根
        [NameInMap("transaction_root")]
        [Validation(Required=true)]
        public string TransactionRoot { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 区块高度
        [NameInMap("number")]
        [Validation(Required=true)]
        public long? Number { get; set; }

        // 成块时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
