// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
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

        // 还款状态
        [NameInMap("repayment_status")]
        [Validation(Required=false)]
        public string RepaymentStatus { get; set; }

        // 已还本金，单位为分
        [NameInMap("paid_principal")]
        [Validation(Required=false)]
        public long? PaidPrincipal { get; set; }

        // 已还利息，单位为分
        [NameInMap("paid_interest")]
        [Validation(Required=false)]
        public long? PaidInterest { get; set; }

        // 已还总额，单位为分
        [NameInMap("paid_total")]
        [Validation(Required=false)]
        public long? PaidTotal { get; set; }

    }

}
