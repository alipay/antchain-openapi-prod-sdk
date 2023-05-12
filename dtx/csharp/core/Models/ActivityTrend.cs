// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 主事务趋势图
    public class ActivityTrend : TeaModel {
        // 时间点
        [NameInMap("time")]
        [Validation(Required=true)]
        public long? Time { get; set; }

        // 总数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 成功数
        [NameInMap("success")]
        [Validation(Required=true)]
        public long? Success { get; set; }

        // 回滚数
        [NameInMap("rollback")]
        [Validation(Required=true)]
        public long? Rollback { get; set; }

    }

}
