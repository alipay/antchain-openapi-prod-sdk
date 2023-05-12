// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 异常事务数趋势图
    public class ExceptionTrend : TeaModel {
        // 时间点
        [NameInMap("time")]
        [Validation(Required=true)]
        public long? Time { get; set; }

        // 异常事务数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
