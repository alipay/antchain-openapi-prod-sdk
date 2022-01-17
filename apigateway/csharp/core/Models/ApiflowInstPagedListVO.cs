// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiflowInstPagedListVO
    public class ApiflowInstPagedListVO : TeaModel {
        // list
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ApiflowInstVO> List { get; set; }

        // page_info
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

    }

}
