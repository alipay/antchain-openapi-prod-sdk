// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 分页查询基类
    public class PaginationQuery : TeaModel {
        // 当前页数
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // isLocaleEnabled
        [NameInMap("is_locale_enabled")]
        [Validation(Required=false)]
        public bool? IsLocaleEnabled { get; set; }

        // local
        [NameInMap("local")]
        [Validation(Required=false)]
        public string Local { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // paging
        [NameInMap("paging")]
        [Validation(Required=false)]
        public bool? Paging { get; set; }

        // 查询类型
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // search
        [NameInMap("search")]
        [Validation(Required=false)]
        public bool? Search { get; set; }

        // 排序关键字列表
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<string> Orders { get; set; }

    }

}
