// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed k8s resource cluster state map
    public class ClusterState : TeaModel {
        // 集群名称
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // k8s resource state
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 详细描述或错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
