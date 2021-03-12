// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 蚂蚁链交易汇总信息
    public class BlockchainBrowserTransactionStatistic : TeaModel {
        // 蚂蚁链id
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 开始时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 时间点
        [NameInMap("date_time")]
        [Validation(Required=true)]
        public string DateTime { get; set; }

        // 统计时间内最新块高度
        [NameInMap("last_sum_block_height")]
        [Validation(Required=true)]
        public long? LastSumBlockHeight { get; set; }

        // 统计周期内交易的数量
        [NameInMap("trans_count")]
        [Validation(Required=true)]
        public long? TransCount { get; set; }

    }

}
