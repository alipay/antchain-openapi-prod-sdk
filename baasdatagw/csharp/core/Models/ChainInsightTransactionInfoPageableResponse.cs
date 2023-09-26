// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // ChainInsightTransactionInfo分页结构体
    public class ChainInsightTransactionInfoPageableResponse : TeaModel {
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

        // ChainInsightTransactionInfo列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ChainInsightTransactionInfo> List { get; set; }

    }

}
