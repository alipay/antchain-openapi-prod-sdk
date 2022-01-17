// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ParamMappingInfoPagedListVO
    public class ParamMappingInfoPagedListVO : TeaModel {
        // list
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<ParamMappingInfoVO> List { get; set; }

        // pageInfo
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

    }

}
