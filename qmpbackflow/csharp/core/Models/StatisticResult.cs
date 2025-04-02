// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回执统计结果
    public class StatisticResult : TeaModel {
        // 有效任务总数量
        [NameInMap("valid_count")]
        [Validation(Required=true)]
        public long? ValidCount { get; set; }

        // 各类actionDriverCode的统计结果集合
        [NameInMap("statistic_info_detail_list")]
        [Validation(Required=true)]
        public List<StatisticInfoDetail> StatisticInfoDetailList { get; set; }

    }

}
