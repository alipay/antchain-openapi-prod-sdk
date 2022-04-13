// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 部署单元内Pods
    public class CellPods : TeaModel {
        // 部署单元名称
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // pod标识列表
        [NameInMap("pod_names")]
        [Validation(Required=true)]
        public List<string> PodNames { get; set; }

    }

}
