// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 事务趋势图
    public class Trend : TeaModel {
        // 分支事务数趋势图
        [NameInMap("action_trend")]
        [Validation(Required=true)]
        public List<ActionTrend> ActionTrend { get; set; }

        // 主事务数趋势图
        [NameInMap("activity_trend")]
        [Validation(Required=true)]
        public List<ActivityTrend> ActivityTrend { get; set; }

        // 事务失败数趋势图
        [NameInMap("exception_trend")]
        [Validation(Required=true)]
        public List<ExceptionTrend> ExceptionTrend { get; set; }

    }

}
