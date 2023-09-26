// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察搜索请求
    public class ChainInsightSearchRequest : TeaModel {
        // 插叙偏移量，用于分页；= (pageNo - 1 * pageSize); 最大值 500
        [NameInMap("offset")]
        [Validation(Required=true)]
        public long? Offset { get; set; }

        // 搜索的上下文，在查询下一页时，需要在请求中带入 Response 返回的 context
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

        // 页大小
        [NameInMap("pag_size")]
        [Validation(Required=true)]
        public long? PagSize { get; set; }

        // 需要搜索的请求内容，可以使用 and、or、not、括号 组合查询逻辑
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // 查询某个合约或者存证账户的时间轴返回结果
        [NameInMap("timeline_query")]
        [Validation(Required=false)]
        public string TimelineQuery { get; set; }

        // 查询范围的开始时间戳，毫秒
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 查询范围的终止时间戳，单位毫秒
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline、DigitalAsset
        [NameInMap("enabled_types")]
        [Validation(Required=false)]
        public List<string> EnabledTypes { get; set; }

    }

}
