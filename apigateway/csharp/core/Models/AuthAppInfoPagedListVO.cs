// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // AuthAppInfoPagedListVO
    public class AuthAppInfoPagedListVO : TeaModel {
        // list
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<AuthAppInfoVO> List { get; set; }

        // pageInfo
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

    }

}
