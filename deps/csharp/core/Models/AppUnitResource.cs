// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用单元资源统计
    public class AppUnitResource : TeaModel {
        // 应用 ID
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // 单元id
        [NameInMap("unit_id")]
        [Validation(Required=false)]
        public string UnitId { get; set; }

        // 机器数
        [NameInMap("machine_count")]
        [Validation(Required=false)]
        public long? MachineCount { get; set; }

        // 已挂载机器数
        [NameInMap("mounted_machine_count")]
        [Validation(Required=false)]
        public long? MountedMachineCount { get; set; }

        // 负载均衡数
        [NameInMap("slb_count")]
        [Validation(Required=false)]
        public long? SlbCount { get; set; }

        // 负载均衡权重
        [NameInMap("slb_weight")]
        [Validation(Required=false)]
        public long? SlbWeight { get; set; }

    }

}
