// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // 集群模式
    public class ClusterMode : TeaModel {
        // 集群模式
        [NameInMap("cluster_mode")]
        [Validation(Required=true)]
        public string ClusterMode_ { get; set; }

        // 区域
        [NameInMap("regions")]
        [Validation(Required=true)]
        public List<ClusterMeta> Regions { get; set; }

    }

}
