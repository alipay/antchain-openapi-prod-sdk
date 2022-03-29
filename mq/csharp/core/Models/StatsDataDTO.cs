// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 采集点信息
    public class StatsDataDTO : TeaModel {
        // 横轴，毫秒时间戳
        [NameInMap("x")]
        [Validation(Required=true)]
        public long? X { get; set; }

        // 纵轴，数据（TPS 或者总量）
        [NameInMap("y")]
        [Validation(Required=true)]
        public string Y { get; set; }

    }

}
