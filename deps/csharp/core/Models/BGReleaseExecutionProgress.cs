// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // BGReleaseExecutionProgress
    public class BGReleaseExecutionProgress : TeaModel {
        // unit_id
        [NameInMap("unit_id")]
        [Validation(Required=false)]
        public string UnitId { get; set; }

        // unit_type
        [NameInMap("unit_type")]
        [Validation(Required=false)]
        public string UnitType { get; set; }

        // resource_type
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // traffic_execution_progress_of_service
        [NameInMap("traffic_execution_progress_of_service")]
        [Validation(Required=false)]
        public List<SlbExecutionProgress> TrafficExecutionProgressOfService { get; set; }

        // service_execution_progress_group
        [NameInMap("service_execution_progress_group")]
        [Validation(Required=false)]
        public List<TaskExecutionProgress> ServiceExecutionProgressGroup { get; set; }

        // rollback_service_execution_progress_group
        [NameInMap("rollback_service_execution_progress_group")]
        [Validation(Required=false)]
        public List<TaskExecutionProgress> RollbackServiceExecutionProgressGroup { get; set; }

        // base_progress
        [NameInMap("base_progress")]
        [Validation(Required=false)]
        public ResourceGroupExecutionProgress BaseProgress { get; set; }

    }

}
