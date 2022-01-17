// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // RouterInfoQueryVO
    public class RouterInfoQueryVO : TeaModel {
        // pageInfo
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

        // query
        [NameInMap("query")]
        [Validation(Required=false)]
        public RouterInfoVO Query { get; set; }

        // 是否模糊搜索
        [NameInMap("fuzzy_search")]
        [Validation(Required=false)]
        public bool? FuzzySearch { get; set; }

    }

}
