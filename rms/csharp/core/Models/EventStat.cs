// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 时间统计
    public class EventStat : TeaModel {
        // 告警时间
        [NameInMap("alarm_time")]
        [Validation(Required=false)]
        public long? AlarmTime { get; set; }

        // 告警等级
        [NameInMap("alarm_level")]
        [Validation(Required=false)]
        public long? AlarmLevel { get; set; }

        // 告警统计数
        [NameInMap("count")]
        [Validation(Required=false)]
        public long? Count { get; set; }

    }

}
