// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察搜索返回结果
    public class ChainInsightSearchResponse : TeaModel {
        // 搜索命中的结果总数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 搜索总共消耗了多长时间，时间单位毫秒
        [NameInMap("took")]
        [Validation(Required=true)]
        public long? Took { get; set; }

        // 当前搜索的 context；翻页时请求中的 context 需要配置为该值
        [NameInMap("context")]
        [Validation(Required=true)]
        public string Context { get; set; }

        // 搜索结果
        [NameInMap("items")]
        [Validation(Required=true)]
        public List<ChainInsightSearchResultItem> Items { get; set; }

    }

}
