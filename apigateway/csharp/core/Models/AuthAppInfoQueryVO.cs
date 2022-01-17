// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // AuthAppInfoQueryVO
    public class AuthAppInfoQueryVO : TeaModel {
        // pageInfo
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

        // query
        [NameInMap("query")]
        [Validation(Required=false)]
        public AuthAppInfoVO Query { get; set; }

        // 自定义查询条件
        [NameInMap("query_condition")]
        [Validation(Required=false)]
        public string QueryCondition { get; set; }

        // 是否支持模糊查询
        [NameInMap("fuzzy_search")]
        [Validation(Required=false)]
        public bool? FuzzySearch { get; set; }

    }

}
