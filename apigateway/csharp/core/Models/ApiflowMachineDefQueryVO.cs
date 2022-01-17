// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiflowMachineDefQueryVO
    public class ApiflowMachineDefQueryVO : TeaModel {
        // fuzzy_search
        [NameInMap("fuzzy_search")]
        [Validation(Required=false)]
        public bool? FuzzySearch { get; set; }

        // page_info
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageInfo PageInfo { get; set; }

        // query
        [NameInMap("query")]
        [Validation(Required=false)]
        public ApiflowMachineDefVO Query { get; set; }

    }

}
