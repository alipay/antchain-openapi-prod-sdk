// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // AggregateExecutableProgress
    public class AggregateExecutableProgress : TeaModel {
        // base_progress
        [NameInMap("base_progress")]
        [Validation(Required=false)]
        public ResourceGroupExecutionProgress BaseProgress { get; set; }

        // bg_release_progresses
        [NameInMap("bg_release_progresses")]
        [Validation(Required=false)]
        public List<BGReleaseExecutionProgress> BgReleaseProgresses { get; set; }

        // app_service_progresses
        [NameInMap("app_service_progresses")]
        [Validation(Required=false)]
        public List<AppServiceExecutionProgressWithRollbackInfo> AppServiceProgresses { get; set; }

        // common_progresses
        [NameInMap("common_progresses")]
        [Validation(Required=false)]
        public List<ResourceGroupExecutionProgress> CommonProgresses { get; set; }

    }

}
