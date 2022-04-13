// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryPodLogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 容器名称
        // The container for which to stream logs. Defaults to only container if there is one container in the pod. (optional)
        [NameInMap("container_name")]
        [Validation(Required=false)]
        public string ContainerName { get; set; }

        // namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // pod名称
        [NameInMap("pod_name")]
        [Validation(Required=true)]
        public string PodName { get; set; }

        // A relative time in seconds before the current time from which to show logs. If this value precedes the time a pod was started, only logs since the pod start will be returned. If this value is in the future, no logs will be returned. Only one of sinceSeconds or sinceTime may be specified. (optional)
        [NameInMap("since_seconds")]
        [Validation(Required=false)]
        public long? SinceSeconds { get; set; }

        // the number of lines from the end of the logs to show
        [NameInMap("tail_lines")]
        [Validation(Required=false)]
        public long? TailLines { get; set; }

        // If true, add an RFC3339 or RFC3339Nano timestamp at the beginning of every line of log output. Defaults to false. (optional)
        [NameInMap("timestamps")]
        [Validation(Required=false)]
        public bool? Timestamps { get; set; }

        // cluster对应的aks中minion cluster的id
        [NameInMap("minion_cluster_id")]
        [Validation(Required=false)]
        public string MinionClusterId { get; set; }

    }

}
