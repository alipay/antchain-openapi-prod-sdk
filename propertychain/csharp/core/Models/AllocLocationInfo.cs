// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 分配的仓位
    public class AllocLocationInfo : TeaModel {
        // 仓位ID
        [NameInMap("location_id")]
        [Validation(Required=false)]
        public string LocationId { get; set; }

        // 仓位名称
        [NameInMap("location_name")]
        [Validation(Required=false)]
        public string LocationName { get; set; }

        // 仓位容量
        [NameInMap("capacity")]
        [Validation(Required=false)]
        public long? Capacity { get; set; }

        // 已用容量
        [NameInMap("used_capacity")]
        [Validation(Required=false)]
        public string UsedCapacity { get; set; }

        // 监控等级【VIDEOREGULATORY：视频监控】
        [NameInMap("monitor_capacity")]
        [Validation(Required=false)]
        public string MonitorCapacity { get; set; }

        // 监控水平【STANDARD：标准版，UPGRADED：升级版】
        [NameInMap("monitor_level")]
        [Validation(Required=false)]
        public string MonitorLevel { get; set; }

    }

}
