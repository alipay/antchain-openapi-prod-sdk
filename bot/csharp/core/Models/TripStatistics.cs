// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 行程统计 详细列表
    public class TripStatistics : TeaModel {
        // 行驶天数
        [NameInMap("trip_day")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TripDay { get; set; }

        // 总里程
        [NameInMap("total_distance")]
        [Validation(Required=true)]
        public long? TotalDistance { get; set; }

        // 总用时
        [NameInMap("total_duration")]
        [Validation(Required=true)]
        public long? TotalDuration { get; set; }

        // 行驶次数
        [NameInMap("trip_count")]
        [Validation(Required=true)]
        public long? TripCount { get; set; }

    }

}
