// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 分页属性
    public class ALiYunPagination : TeaModel {
        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 分页编号
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 总数大小
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
