// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 行程列表
    public class TripView : TeaModel {
        // 开始时间
        [NameInMap("trip_begin_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TripBeginTime { get; set; }

        // 结束时间
        [NameInMap("trip_end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TripEndTime { get; set; }

        // 行驶公里数
        [NameInMap("trip_total_distance")]
        [Validation(Required=true)]
        public long? TripTotalDistance { get; set; }

        // 用时
        [NameInMap("trip_time")]
        [Validation(Required=true)]
        public long? TripTime { get; set; }

    }

}
