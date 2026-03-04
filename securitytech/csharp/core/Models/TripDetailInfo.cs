// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 行程详细信息
    public class TripDetailInfo : TeaModel {
        // 开始时间 时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 结束时间 时间戳
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 行程id
        [NameInMap("trip_id")]
        [Validation(Required=true)]
        public string TripId { get; set; }

        // 行驶里程
        [NameInMap("mileage")]
        [Validation(Required=true)]
        public string Mileage { get; set; }

        // 时长
        [NameInMap("duration")]
        [Validation(Required=true)]
        public DurationInfo Duration { get; set; }

        // 最高速度
        [NameInMap("max_speed")]
        [Validation(Required=true)]
        public string MaxSpeed { get; set; }

        // 平均速度
        [NameInMap("avg_speed")]
        [Validation(Required=true)]
        public string AvgSpeed { get; set; }

        // 开始地址
        [NameInMap("first_address")]
        [Validation(Required=true)]
        public string FirstAddress { get; set; }

        // 结束地址
        [NameInMap("last_address")]
        [Validation(Required=true)]
        public string LastAddress { get; set; }

        // 开始定位时间 时间戳
        [NameInMap("first_location_time")]
        [Validation(Required=true)]
        public long? FirstLocationTime { get; set; }

        // 最终定位时间 时间戳
        [NameInMap("last_location_time")]
        [Validation(Required=true)]
        public long? LastLocationTime { get; set; }

    }

}
