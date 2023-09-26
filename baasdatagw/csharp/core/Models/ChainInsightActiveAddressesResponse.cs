// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上近期活跃地址响应
    public class ChainInsightActiveAddressesResponse : TeaModel {
        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // 合计
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 结果列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<MapEntryList> List { get; set; }

    }

}
