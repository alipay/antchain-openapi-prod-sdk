// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 固定副本数弹性配置。
    public class FixedReplicaElasticConfig : TeaModel {
        // 各部署单元/集群的副本数配置。
        [NameInMap("replicas")]
        [Validation(Required=true)]
        public List<ReplicaCount> Replicas { get; set; }

    }

}
