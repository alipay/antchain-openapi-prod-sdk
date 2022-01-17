// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiGroupPagedListVO
    public class ApiGroupPagedListVO : TeaModel {
        // 当前页的数据
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ApiGroupVO> List { get; set; }

        // page_info
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

    }

}
