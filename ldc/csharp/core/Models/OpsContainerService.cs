// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 容器服务运维
    public class OpsContainerService : TeaModel {
        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 容器服务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 待操作目标pods列表
        [NameInMap("selected_pods")]
        [Validation(Required=false)]
        public List<CellPods> SelectedPods { get; set; }

    }

}
