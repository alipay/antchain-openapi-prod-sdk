// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // SystemClusterPagedListVO
    public class SystemClusterPagedListVO : TeaModel {
        // list
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<SystemClusterVO> List { get; set; }

        // page_info
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

    }

}
