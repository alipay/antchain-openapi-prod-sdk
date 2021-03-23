// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 数据状态驱动
    public class StatusDrive : TeaModel {
        // 起始状态
        [NameInMap("from_status")]
        [Validation(Required=true)]
        public string FromStatus { get; set; }

        // 下一状态
        [NameInMap("to_status")]
        [Validation(Required=true)]
        public string ToStatus { get; set; }

        // 驱动上链记录哈希
        [NameInMap("drive_hash")]
        [Validation(Required=true)]
        public string DriveHash { get; set; }

        // 链上时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
