// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // ProduceFeatureResultObj
    public class ProduceFeatureResultObj : TeaModel {
        // projectId
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // taskId
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // publishId
        [NameInMap("publish_id")]
        [Validation(Required=false)]
        public string PublishId { get; set; }

        // supplementId
        [NameInMap("supplement_id")]
        [Validation(Required=false)]
        public string SupplementId { get; set; }

        // fileKey
        [NameInMap("file_key")]
        [Validation(Required=false)]
        public string FileKey { get; set; }

        // guid
        [NameInMap("guid")]
        [Validation(Required=false)]
        public string Guid { get; set; }

        // partition
        [NameInMap("partition")]
        [Validation(Required=false)]
        public string Partition { get; set; }

    }

}
