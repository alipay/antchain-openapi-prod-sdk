// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // kubernetes集群事件信息
    public class ClusterEvents : TeaModel {
        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 集群事件
        [NameInMap("events")]
        [Validation(Required=true)]
        public List<KubernetesEvents> Events { get; set; }

    }

}
