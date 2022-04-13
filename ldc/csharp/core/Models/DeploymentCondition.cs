// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // DeploymentCondition describes the state of a deployment at a certain point.
    public class DeploymentCondition : TeaModel {
        // Last time the condition transitioned from one status to another.
        [NameInMap("last_transition_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastTransitionTime { get; set; }

        // The last time this condition was updated.
        // 
        [NameInMap("last_update_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastUpdateTime { get; set; }

        // A human readable message indicating details about the transition.
        // 
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // The reason for the condition_s last transition.
        // 
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // Status of the condition, one of True, False, Unknown.
        // 
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // Type of deployment condition.
        // 
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
