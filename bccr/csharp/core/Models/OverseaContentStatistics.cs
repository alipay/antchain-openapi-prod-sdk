// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 出海视频统计数据
    public class OverseaContentStatistics : TeaModel {
        // 发布视频id
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // 总观看次数
        [NameInMap("total_views")]
        [Validation(Required=true)]
        public string TotalViews { get; set; }

        // 总观看时长
        [NameInMap("total_view_duration")]
        [Validation(Required=true)]
        public string TotalViewDuration { get; set; }

        // 总平均观看时长
        [NameInMap("total_average_view_duration")]
        [Validation(Required=true)]
        public string TotalAverageViewDuration { get; set; }

        // 总预计收入
        [NameInMap("total_revenue")]
        [Validation(Required=true)]
        public string TotalRevenue { get; set; }

        // 每日详细统计列表
        [NameInMap("day_statistics_list")]
        [Validation(Required=true)]
        public List<DayStatisticsInfo> DayStatisticsList { get; set; }

    }

}
