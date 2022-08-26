// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_7365e031a87c467bbe817bec28a2a1dc.Models
{
    // 区块信息
    public class BlockInfo : TeaModel {
        // 业务数据
        [NameInMap("biz_data")]
        [Validation(Required=true)]
        public string BizData { get; set; }

        // 区块链唯一性标识
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 区块哈希
        [NameInMap("block_hash")]
        [Validation(Required=true)]
        public string BlockHash { get; set; }

        // 块高
        [NameInMap("height")]
        [Validation(Required=true)]
        public long? Height { get; set; }

        // 上一个区块的hash
        [NameInMap("parent_hash")]
        [Validation(Required=true)]
        public string ParentHash { get; set; }

        // size
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // 出块时间
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 包含交易数
        [NameInMap("transaction_size")]
        [Validation(Required=true)]
        public long? TransactionSize { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
