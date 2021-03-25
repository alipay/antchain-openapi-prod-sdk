// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 手续费规则结果
    public class CommissionRuleResponse : TeaModel {
        // 手续费到账方
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 手续费周期列表
        [NameInMap("commission_periods")]
        [Validation(Required=true)]
        public List<CommissionPeriod> CommissionPeriods { get; set; }

    }

}
