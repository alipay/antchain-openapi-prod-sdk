// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // AppServiceExecutionProgress
    public class AppServiceExecutionProgress : TeaModel {
        // base_progress
        [NameInMap("base_progress")]
        [Validation(Required=false)]
        public ResourceGroupExecutionProgress BaseProgress { get; set; }

        // group_count
        [NameInMap("group_count")]
        [Validation(Required=false)]
        public long? GroupCount { get; set; }

        // pre_deployment_execution_progresses
        [NameInMap("pre_deployment_execution_progresses")]
        [Validation(Required=false)]
        public List<TaskExecutionProgress> PreDeploymentExecutionProgresses { get; set; }

        // post_deployment_execution_progresses
        [NameInMap("post_deployment_execution_progresses")]
        [Validation(Required=false)]
        public List<TaskExecutionProgress> PostDeploymentExecutionProgresses { get; set; }

        // group_execution_progresses
        [NameInMap("group_execution_progresses")]
        [Validation(Required=false)]
        public List<ResourceGroupExecutionProgress> GroupExecutionProgresses { get; set; }

    }

}
