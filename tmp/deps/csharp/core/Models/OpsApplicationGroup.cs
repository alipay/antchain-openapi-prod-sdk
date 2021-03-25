// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一组执行运维操作的应用（服务），同一个组中的应用（服务）将并行执行操作。
    public class OpsApplicationGroup : TeaModel {
        // 此运维应用（服务）组中包含的应用（服务）列表
        [NameInMap("applications")]
        [Validation(Required=false)]
        public List<OpsApplication> Applications { get; set; }

    }

}
