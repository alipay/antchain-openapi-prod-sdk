// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 一键创建集群同步任务结果
    public class SyncBucketAddResult : TeaModel {
        // 集群同步任务id
        [NameInMap("cluster_task_id")]
        [Validation(Required=true)]
        public string ClusterTaskId { get; set; }

        // 集群同步任务状态
        [NameInMap("cluster_task_status")]
        [Validation(Required=true)]
        public string ClusterTaskStatus { get; set; }

        // 源集群id
        [NameInMap("source_cluster_id")]
        [Validation(Required=true)]
        public string SourceClusterId { get; set; }

        // 目标集群id
        [NameInMap("target_cluster_id")]
        [Validation(Required=true)]
        public string TargetClusterId { get; set; }

    }

}
