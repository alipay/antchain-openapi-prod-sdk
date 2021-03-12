// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云交易查询结果
    public class ALiYunTransactionResult : TeaModel {
        // block_hash
        [NameInMap("block_hash")]
        [Validation(Required=false)]
        public string BlockHash { get; set; }

        // block_height
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // block_version
        [NameInMap("block_version")]
        [Validation(Required=false)]
        public string BlockVersion { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // Transaction
        [NameInMap("transaction")]
        [Validation(Required=false)]
        public ALiYunTransaction Transaction { get; set; }

    }

}
