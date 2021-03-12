// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云链统计信息
    public class ALiYunChainStatics : TeaModel {
        // alias
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // Dt
        [NameInMap("dt")]
        [Validation(Required=false)]
        public long? Dt { get; set; }

        // trans_count
        [NameInMap("trans_count")]
        [Validation(Required=false)]
        public long? TransCount { get; set; }

        // last_sum_block_height
        [NameInMap("last_sum_block_height")]
        [Validation(Required=false)]
        public long? LastSumBlockHeight { get; set; }

        // creat_time
        [NameInMap("creat_time")]
        [Validation(Required=false)]
        public long? CreatTime { get; set; }

    }

}
