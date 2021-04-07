// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // request中的单个任务
    public class Task : TeaModel {
        // context
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

        // execution_times
        [NameInMap("execution_times")]
        [Validation(Required=false)]
        public long? ExecutionTimes { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // resource_id
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // resource_type
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // request
        [NameInMap("request")]
        [Validation(Required=false)]
        public TaskRequest Request { get; set; }

    }

}
