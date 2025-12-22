// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotx行程统计
    public class TripStatistics : TeaModel {
        // 总里程
        [NameInMap("total_mileage")]
        [Validation(Required=true)]
        public string TotalMileage { get; set; }

        // 时间体
        [NameInMap("total_duration")]
        [Validation(Required=true)]
        public TripDuration TotalDuration { get; set; }

        // 总次数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 时期码
        [NameInMap("period_code")]
        [Validation(Required=true)]
        public long? PeriodCode { get; set; }

    }

}
