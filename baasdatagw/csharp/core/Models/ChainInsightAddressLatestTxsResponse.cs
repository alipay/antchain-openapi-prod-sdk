// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 地址最近交易返回值
    public class ChainInsightAddressLatestTxsResponse : TeaModel {
        // 页大小
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

        // 近期交易详情
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ChainInsightTransaction> List { get; set; }

    }

}
