// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云最新区块列表查询的单元信息
    public class ALiYunChainBlockInfo : TeaModel {
        // alias
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // root_tx_hash
        [NameInMap("root_tx_hash")]
        [Validation(Required=false)]
        public string RootTxHash { get; set; }

        // height
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // previous_hash
        [NameInMap("previous_hash")]
        [Validation(Required=false)]
        public string PreviousHash { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // biz_data
        [NameInMap("biz_data")]
        [Validation(Required=false)]
        public string BizData { get; set; }

        // transaction_size
        [NameInMap("transaction_size")]
        [Validation(Required=false)]
        public long? TransactionSize { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // size
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

    }

}
