// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // DeploymentSpec
    public class DeploymentSpec : TeaModel {
        // Minimum number of seconds for which a newly created pod should be ready without any of its container crashing
        [NameInMap("min_ready_seconds")]
        [Validation(Required=false)]
        public long? MinReadySeconds { get; set; }

        // Indicates that the deployment is paused.
        // 
        [NameInMap("paused")]
        [Validation(Required=false)]
        public bool? Paused { get; set; }

        // he maximum time in seconds for a deployment to make progress before it is considered to be failed.
        [NameInMap("progress_deadline_seconds")]
        [Validation(Required=false)]
        public long? ProgressDeadlineSeconds { get; set; }

        // Number of desired pods. 
        [NameInMap("replicas")]
        [Validation(Required=true)]
        public long? Replicas { get; set; }

        // The number of old ReplicaSets to retain to allow rollback.
        [NameInMap("revision_history_limit")]
        [Validation(Required=false)]
        public long? RevisionHistoryLimit { get; set; }

        // Label selector for pods. 
        [NameInMap("selector")]
        [Validation(Required=false)]
        public LabelSelector Selector { get; set; }

        // The deployment strategy to use to replace existing pods with new ones.
        // 
        [NameInMap("strategy")]
        [Validation(Required=false)]
        public DeploymentStrategy Strategy { get; set; }

        // Template describes the pods that will be created.
        [NameInMap("template")]
        [Validation(Required=true)]
        public PodTemplateSpec Template { get; set; }

    }

}
