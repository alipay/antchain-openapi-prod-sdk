// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // cors分页信息
    public class CorsInfoPagedListVO : TeaModel {
        // cors列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<CorsInfoVO> List { get; set; }

        // 分页信息
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

    }

}
