// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // 集群信息
    public class ClusterMeta : TeaModel {
        // 集群唯一标识
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        // 集群名字
        [NameInMap("cluster_name")]
        [Validation(Required=false)]
        public string ClusterName { get; set; }

        // 区域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

    }

}
