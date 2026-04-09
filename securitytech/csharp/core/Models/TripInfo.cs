// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 车辆行程信息
    public class TripInfo : TeaModel {
        // tripList
        [NameInMap("trip_id")]
        [Validation(Required=true)]
        public string TripId { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 起点位置
        [NameInMap("start_location")]
        [Validation(Required=false)]
        public string StartLocation { get; set; }

        // 终点位置
        [NameInMap("end_location")]
        [Validation(Required=false)]
        public string EndLocation { get; set; }

        // 行驶里程（km）
        [NameInMap("mileage")]
        [Validation(Required=false)]
        public string Mileage { get; set; }

    }

}
