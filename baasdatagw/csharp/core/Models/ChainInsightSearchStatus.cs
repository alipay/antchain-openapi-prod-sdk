// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据搜索状态
    public class ChainInsightSearchStatus : TeaModel {
        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链名称
        [NameInMap("biz_id_name")]
        [Validation(Required=false)]
        public string BizIdName { get; set; }

        // Indexing,Enabled,Disabled
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 当前索引的区块高度
        [NameInMap("current_height")]
        [Validation(Required=false)]
        public long? CurrentHeight { get; set; }

        // 当前区块链高度
        [NameInMap("ledger_height")]
        [Validation(Required=false)]
        public long? LedgerHeight { get; set; }

        // 预计索引完成的时间，单位秒
        [NameInMap("estimate_time")]
        [Validation(Required=false)]
        public long? EstimateTime { get; set; }

    }

}
