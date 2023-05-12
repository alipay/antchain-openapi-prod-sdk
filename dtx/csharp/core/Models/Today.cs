// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 当天事务数统计
    public class Today : TeaModel {
        // 当天分支事务数
        [NameInMap("action_num")]
        [Validation(Required=true)]
        public long? ActionNum { get; set; }

        // 当天事务数
        [NameInMap("activity_num")]
        [Validation(Required=true)]
        public long? ActivityNum { get; set; }

    }

}
