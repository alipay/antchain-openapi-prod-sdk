// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 联邦资源在某个子集群中的分发状态
    public class ClusterState : TeaModel {
        // 集群名称
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // 联邦资源的分发状态，空字符串代表成功，否则为错误码
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 详细错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
