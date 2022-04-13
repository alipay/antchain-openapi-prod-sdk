// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar升级状态
    public class SidecarReleaseStatus : TeaModel {
        // 运维单号
        [NameInMap("order_num")]
        [Validation(Required=true)]
        public string OrderNum { get; set; }

        // 部署单元
        [NameInMap("cell_name")]
        [Validation(Required=true)]
        public string CellName { get; set; }

        // 所处状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
