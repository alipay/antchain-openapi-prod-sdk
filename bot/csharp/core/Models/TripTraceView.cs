// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 行程统计详情
    public class TripTraceView : TeaModel {
        // 开始时间
        [NameInMap("begin_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string BeginTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 平均速度
        [NameInMap("avg_speed")]
        [Validation(Required=true)]
        public long? AvgSpeed { get; set; }

        // 最大速度
        [NameInMap("max_speed")]
        [Validation(Required=true)]
        public long? MaxSpeed { get; set; }

        // 最后定位时间
        [NameInMap("last_location_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastLocationTime { get; set; }

        // 最后定位地址
        [NameInMap("last_location")]
        [Validation(Required=true)]
        public string LastLocation { get; set; }

    }

}
