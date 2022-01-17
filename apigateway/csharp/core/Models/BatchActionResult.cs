// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // BatchActionResult
    public class BatchActionResult : TeaModel {
        // 批量挂载结果
        [NameInMap("results")]
        [Validation(Required=false)]
        public List<ActionResult> Results { get; set; }

        // total_count
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // success_count
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // failed_count
        [NameInMap("failed_count")]
        [Validation(Required=false)]
        public long? FailedCount { get; set; }

    }

}
