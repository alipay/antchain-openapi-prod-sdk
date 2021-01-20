// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // AppServiceExecutionProgressWithRollbackInfo
    public class AppServiceExecutionProgressWithRollbackInfo : TeaModel {
        // progress
        [NameInMap("progress")]
        [Validation(Required=false)]
        public AppServiceExecutionProgress Progress { get; set; }

        // rollback_progress
        [NameInMap("rollback_progress")]
        [Validation(Required=false)]
        public AppServiceExecutionProgress RollbackProgress { get; set; }

    }

}
