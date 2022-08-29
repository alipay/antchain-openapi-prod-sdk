// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 日统计数据模型
    public class DayStatisticsInfo : TeaModel {
        // 日期时间戳
        [NameInMap("date")]
        [Validation(Required=true)]
        public long? Date { get; set; }

        // 日观看次数
        [NameInMap("day_views")]
        [Validation(Required=true)]
        public string DayViews { get; set; }

        // 日观看时长
        [NameInMap("day_view_duration")]
        [Validation(Required=true)]
        public string DayViewDuration { get; set; }

        // 日平均观看时长
        [NameInMap("day_average_view_duration")]
        [Validation(Required=true)]
        public string DayAverageViewDuration { get; set; }

        // 日预计收入
        [NameInMap("revenue")]
        [Validation(Required=true)]
        public string Revenue { get; set; }

    }

}
