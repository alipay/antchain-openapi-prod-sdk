// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商户积分库和与预算库信息
    public class MerchantBudget : TeaModel {
        // 积分库代码
        [NameInMap("point_lib_code")]
        [Validation(Required=true)]
        public string PointLibCode { get; set; }

        // 预算库代码
        [NameInMap("budget_code")]
        [Validation(Required=true)]
        public string BudgetCode { get; set; }

        // 预算库描述
        [NameInMap("budget_desc")]
        [Validation(Required=true)]
        public string BudgetDesc { get; set; }

        // 预算库启用时间
        [NameInMap("budget_start_time")]
        [Validation(Required=true)]
        public string BudgetStartTime { get; set; }

        // 预算库截止时间
        [NameInMap("budget_end_time")]
        [Validation(Required=true)]
        public string BudgetEndTime { get; set; }

    }

}
