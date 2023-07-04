// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用部署拓扑约束，比如：亲和性、反亲和性、sidecar等
    public class TopologyConstraints : TeaModel {
        // 亲和性配置
        [NameInMap("affinity")]
        [Validation(Required=false)]
        public AffinityConfig Affinity { get; set; }

        // 反亲和性配置
        [NameInMap("anti_affinity")]
        [Validation(Required=false)]
        public AffinityConfig AntiAffinity { get; set; }

        // sidecar应用列表
        [NameInMap("sidecars")]
        [Validation(Required=false)]
        public List<string> Sidecars { get; set; }

    }

}
