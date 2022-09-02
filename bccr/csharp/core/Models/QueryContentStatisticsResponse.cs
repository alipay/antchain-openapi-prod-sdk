// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryContentStatisticsResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 总观看次数
        [NameInMap("total_views")]
        [Validation(Required=false)]
        public string TotalViews { get; set; }

        // 总观看时长
        [NameInMap("total_view_duration")]
        [Validation(Required=false)]
        public string TotalViewDuration { get; set; }

        // 总平均观看时长
        [NameInMap("total_average_view_duration")]
        [Validation(Required=false)]
        public string TotalAverageViewDuration { get; set; }

        //  总预计收入
        [NameInMap("total_revenue")]
        [Validation(Required=false)]
        public string TotalRevenue { get; set; }

        // 每日详细统计列表
        [NameInMap("day_statistics_list")]
        [Validation(Required=false)]
        public List<DayStatisticsInfo> DayStatisticsList { get; set; }

    }

}
