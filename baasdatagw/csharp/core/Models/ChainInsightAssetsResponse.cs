// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上资产信息响应
    public class ChainInsightAssetsResponse : TeaModel {
        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 合计
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 结果列表
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<ChainInsightAsset> List { get; set; }

    }

}
