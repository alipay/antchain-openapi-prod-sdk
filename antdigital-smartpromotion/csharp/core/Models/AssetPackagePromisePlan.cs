// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SMARTPROMOTION.Models
{
    // 资产包履约计划
    public class AssetPackagePromisePlan : TeaModel {
        // 账期
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 还款时间yyyy-MM-dd
        [NameInMap("pay_day")]
        [Validation(Required=false)]
        public string PayDay { get; set; }

        // 计划还款总额，单位为分
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 本金，单位为分
        [NameInMap("principal_amount")]
        [Validation(Required=false)]
        public long? PrincipalAmount { get; set; }

        // 利息，单位为分
        [NameInMap("interest_amount")]
        [Validation(Required=false)]
        public long? InterestAmount { get; set; }

        // 构成订单数
        [NameInMap("order_count")]
        [Validation(Required=false)]
        public long? OrderCount { get; set; }

    }

}
