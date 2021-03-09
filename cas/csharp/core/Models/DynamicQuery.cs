// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 动态查询
    public class DynamicQuery : TeaModel {
        // 分页规则-currentPage
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 字段过滤
        [NameInMap("filter")]
        [Validation(Required=false)]
        public string Filter { get; set; }

        // 分页规则-pageSize
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 具体的查询条件字符串
        [NameInMap("query")]
        [Validation(Required=true)]
        public string Query { get; set; }

        // 查询结果的排序规则
        [NameInMap("sort")]
        [Validation(Required=false)]
        public string Sort { get; set; }

    }

}
