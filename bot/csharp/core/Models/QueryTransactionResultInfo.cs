// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 查询交易结果信息
    public class QueryTransactionResultInfo : TeaModel {
        // 区块hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // 父区块hash
        [NameInMap("parent_block_hash")]
        [Validation(Required=false)]
        public string ParentBlockHash { get; set; }

        // 交易时间戳
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public string Timestamp { get; set; }

        // 该交易所能消耗的最大gas
        [NameInMap("gas")]
        [Validation(Required=false)]
        public long? Gas { get; set; }

        // 交易发起方账户
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // 交易接收方账户
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // 交易类型
        [NameInMap("tx_type")]
        [Validation(Required=false)]
        public string TxType { get; set; }

        // 交易返回的数据
        [NameInMap("data")]
        [Validation(Required=false)]
        public QueryChainDataTransactionResultData Data { get; set; }

    }

}
