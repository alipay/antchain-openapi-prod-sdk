// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 事务统计信息
    public class Stats : TeaModel {
        // 异常事务数
        [NameInMap("exception")]
        [Validation(Required=true)]
        public ExceptionStats Exception { get; set; }

        // 进行中事务数统计
        [NameInMap("ongoing")]
        [Validation(Required=true)]
        public Ongoing Ongoing { get; set; }

        // 当天事务数统计
        [NameInMap("today")]
        [Validation(Required=true)]
        public Today Today { get; set; }

    }

}
