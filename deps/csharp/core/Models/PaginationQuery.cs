// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 分页查询
    public class PaginationQuery : TeaModel {
        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 模糊搜索
        [NameInMap("fuzzy_name")]
        [Validation(Required=false)]
        public string FuzzyName { get; set; }

    }

}
