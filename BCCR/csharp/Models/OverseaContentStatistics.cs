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
        /// <summary>
        /// <b>Example:</b>
        /// <para>84343147225530369</para>
        /// </summary>
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // 总观看次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("total_views")]
        [Validation(Required=true)]
        public string TotalViews { get; set; }

        // 总观看时长
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("total_view_duration")]
        [Validation(Required=true)]
        public string TotalViewDuration { get; set; }

        // 总平均观看时长
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("total_average_view_duration")]
        [Validation(Required=true)]
        public string TotalAverageViewDuration { get; set; }

        // 总预计收入
        /// <summary>
        /// <b>Example:</b>
        /// <para>40</para>
        /// </summary>
        [NameInMap("total_revenue")]
        [Validation(Required=true)]
        public string TotalRevenue { get; set; }

        // 每日详细统计列表
        [NameInMap("day_statistics_list")]
        [Validation(Required=true)]
        public List<DayStatisticsInfo> DayStatisticsList { get; set; }

    }

}
