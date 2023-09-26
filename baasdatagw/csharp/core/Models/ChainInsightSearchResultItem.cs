// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察搜索结果的Item
    public class ChainInsightSearchResultItem : TeaModel {
        // 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 结果所在的链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 结果链ID对应的区块链名称
        [NameInMap("biz_name")]
        [Validation(Required=false)]
        public string BizName { get; set; }

        // 结果与搜索请求的相关性程度，(0, 10000000]
        [NameInMap("score")]
        [Validation(Required=true)]
        public long? Score { get; set; }

        // 搜索结果值
        [NameInMap("values")]
        [Validation(Required=true)]
        public List<MapEntry> Values { get; set; }

    }

}
