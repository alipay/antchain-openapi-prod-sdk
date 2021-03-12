// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链交易的汇总信息
    public class ALiYunTransactionSummary : TeaModel {
        // alias
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // trans_type_v6
        [NameInMap("trans_type_v6")]
        [Validation(Required=false)]
        public string TransTypeV6 { get; set; }

        // trans_type_v10
        [NameInMap("trans_type_v10")]
        [Validation(Required=false)]
        public string TransTypeV10 { get; set; }

        // category
        [NameInMap("category")]
        [Validation(Required=false)]
        public long? Category { get; set; }

        // height
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // reference_count
        [NameInMap("reference_count")]
        [Validation(Required=false)]
        public long? ReferenceCount { get; set; }

        // from
        [NameInMap("from")]
        [Validation(Required=false)]
        public string From { get; set; }

        // to
        [NameInMap("to")]
        [Validation(Required=false)]
        public string To { get; set; }

        // gas_used
        [NameInMap("gas_used")]
        [Validation(Required=false)]
        public long? GasUsed { get; set; }

    }

}
