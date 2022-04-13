// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 本地 spanner cluster 详细信息
    public class LocalSpannerClusterDetail : TeaModel {
        // 可用区
        [NameInMap("az")]
        [Validation(Required=true)]
        public string Az { get; set; }

        // 本地集群名称
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // 可能存在的错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 集群状态
        [NameInMap("phase")]
        [Validation(Required=false)]
        public string Phase { get; set; }

        // spanner cluster 集群id
        [NameInMap("spanner_cluster_id")]
        [Validation(Required=false)]
        public string SpannerClusterId { get; set; }

        // 描述spanner cluster健康状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 若干组容器信息
        [NameInMap("sub_clusters_details")]
        [Validation(Required=false)]
        public List<LocalSubClusterDetail> SubClustersDetails { get; set; }

    }

}
