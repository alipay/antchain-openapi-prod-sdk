// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // OperatorQueryVO
    public class OperatorQueryVO : TeaModel {
        // pageInfo
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

        // query
        [NameInMap("query")]
        [Validation(Required=false)]
        public OperatorVO Query { get; set; }

    }

}
