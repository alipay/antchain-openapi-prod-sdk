// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 基于弹性伸缩的应用服务配置
    public class HPABasedElasticConfig : TeaModel {
        // pod要发布的部署单元及每个部署单元副本数的映射关系列表
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<CellReplicasMap> Cells { get; set; }

        // 最小副本数
        [NameInMap("min_replica")]
        [Validation(Required=true)]
        public long? MinReplica { get; set; }

        // 最大副本数
        [NameInMap("max_replica")]
        [Validation(Required=true)]
        public long? MaxReplica { get; set; }

        // 弹性伸缩指标列表
        [NameInMap("metrics")]
        [Validation(Required=true)]
        public List<HPABasedElasticConfigMetric> Metrics { get; set; }

        // 扩缩容规则高级配置
        [NameInMap("behavior")]
        [Validation(Required=false)]
        public HPAScaleBehavior Behavior { get; set; }

    }

}
