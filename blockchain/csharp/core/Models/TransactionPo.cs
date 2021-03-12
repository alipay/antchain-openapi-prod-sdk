// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // blockchain交易结构体
    public class TransactionPo : TeaModel {
        // 交易所在块hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // 交易来源
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // gas消耗
        [NameInMap("gas_used")]
        [Validation(Required=false)]
        public long? GasUsed { get; set; }

        // 交易hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 交易所在块 块高
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 交易返回结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 交易时间
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

        // 交易地址
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // 交易类型 同SDK
        [NameInMap("tx_type")]
        [Validation(Required=false)]
        public long? TxType { get; set; }

        // 转账额度
        [NameInMap("value")]
        [Validation(Required=false)]
        public long? Value { get; set; }

    }

}
