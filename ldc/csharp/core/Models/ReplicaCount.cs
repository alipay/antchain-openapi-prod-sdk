// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 某一部署单元或集群对应的副本数。
    public class ReplicaCount : TeaModel {
        // 副本数量是部署单元维度还是集群维度。目前只支持Cell
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 部署单元名称或集群名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 对应副本数量。
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // （针对huanyu场景），original_count该单元当前的副本个数（count对应期望的副本个数）
        [NameInMap("original_count")]
        [Validation(Required=false)]
        public long? OriginalCount { get; set; }

    }

}
