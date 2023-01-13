// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上区块
    public class ChainInsightBlock : TeaModel {
        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链名称
        [NameInMap("biz_id_name")]
        [Validation(Required=false)]
        public string BizIdName { get; set; }

        // 链ID
        [NameInMap("chain")]
        [Validation(Required=true)]
        public string Chain { get; set; }

        // 所在子网
        [NameInMap("network")]
        [Validation(Required=true)]
        public string Network { get; set; }

        // 区块高度
        [NameInMap("number")]
        [Validation(Required=true)]
        public long? Number { get; set; }

        // 区块Hash
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 区块创建时间戳
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 上一个区块Hash
        [NameInMap("previous_hash")]
        [Validation(Required=true)]
        public string PreviousHash { get; set; }

        // 区块内交易列表
        [NameInMap("transactions")]
        [Validation(Required=true)]
        public List<ChainInsightTransaction> Transactions { get; set; }

        // 区块的json序列化string
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
