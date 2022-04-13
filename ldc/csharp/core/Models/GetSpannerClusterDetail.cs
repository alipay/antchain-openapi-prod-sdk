// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 获取单个spanner cluster的详细信息
    public class GetSpannerClusterDetail : TeaModel {
        // 联邦 spanner cluster 详细信息
        [NameInMap("cluster_detail")]
        [Validation(Required=true)]
        public QuerySpannerClusterDetail ClusterDetail { get; set; }

        // 若干组本地集群信息
        [NameInMap("local_clusters")]
        [Validation(Required=true)]
        public List<LocalSpannerClusterDetail> LocalClusters { get; set; }

    }

}
