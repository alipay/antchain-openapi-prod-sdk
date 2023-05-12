// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 全局统计数据
    public class GlobalStats : TeaModel {
        // 异常事务数
        [NameInMap("exception")]
        [Validation(Required=true)]
        public long? Exception { get; set; }

        // 进行中事务数
        [NameInMap("activity")]
        [Validation(Required=true)]
        public long? Activity { get; set; }

        // 当天事务数
        [NameInMap("today")]
        [Validation(Required=true)]
        public long? Today { get; set; }

        // connection
        [NameInMap("connection")]
        [Validation(Required=false)]
        public long? Connection { get; set; }

    }

}
