// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 手续费规则
    public class CommissionRule : TeaModel {
        // 一级分账方的账户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 手续费规则
        [NameInMap("commission_period")]
        [Validation(Required=true)]
        public CommissionPeriod CommissionPeriod { get; set; }

    }

}
