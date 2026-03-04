// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 行程统计数据
    public class TripStatisticInfo : TeaModel {
        // 总里程
        [NameInMap("total_mileage")]
        [Validation(Required=true)]
        public string TotalMileage { get; set; }

        // 总时长
        [NameInMap("total_duration")]
        [Validation(Required=true)]
        public DurationInfo TotalDuration { get; set; }

        // 总条数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 时间码
        [NameInMap("period_code")]
        [Validation(Required=true)]
        public long? PeriodCode { get; set; }

    }

}
