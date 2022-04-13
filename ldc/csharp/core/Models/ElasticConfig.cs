// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器服务弹性配置。
    public class ElasticConfig : TeaModel {
        // 固定副本数配置。
        [NameInMap("fixed_replica")]
        [Validation(Required=false)]
        public FixedReplicaElasticConfig FixedReplica { get; set; }

        // 弹性伸缩配置
        [NameInMap("hpa")]
        [Validation(Required=false)]
        public HPABasedElasticConfig Hpa { get; set; }

        // 弹性配置模式：
        // FIXED 固定副本数
        // HPA 弹性伸缩
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

    }

}
