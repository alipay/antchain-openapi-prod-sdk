// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 查询应用画像ecs利用率
    public class AppPortraitEcsUsageGet : TeaModel {
        // cpu平均利用率
        [NameInMap("average_cpu")]
        [Validation(Required=true)]
        public long? AverageCpu { get; set; }

        // 内存平均利用率
        [NameInMap("average_mem")]
        [Validation(Required=true)]
        public long? AverageMem { get; set; }

        // 磁盘平均利用率
        [NameInMap("average_disk")]
        [Validation(Required=true)]
        public long? AverageDisk { get; set; }

    }

}
