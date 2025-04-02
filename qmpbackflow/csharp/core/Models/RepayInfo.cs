// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 待还款信息
    public class RepayInfo : TeaModel {
        // true：逾期
        // false：未逾期
        [NameInMap("overdue_flag")]
        [Validation(Required=true)]
        public bool? OverdueFlag { get; set; }

        // 逾期天数
        [NameInMap("over_days")]
        [Validation(Required=true)]
        public long? OverDays { get; set; }

        // 逾期金额在50元以上的客户的逾期天数
        [NameInMap("valuable_over_days")]
        [Validation(Required=true)]
        public long? ValuableOverDays { get; set; }

        // 逾期期数
        [NameInMap("over_period_count")]
        [Validation(Required=true)]
        public long? OverPeriodCount { get; set; }

        // 逾期本金
        [NameInMap("over_principal")]
        [Validation(Required=true)]
        public long? OverPrincipal { get; set; }

        // 逾期利息
        [NameInMap("over_interest")]
        [Validation(Required=true)]
        public long? OverInterest { get; set; }

        // 应还罚息
        [NameInMap("over_punish")]
        [Validation(Required=true)]
        public long? OverPunish { get; set; }

        // 应还逾期总额
        [NameInMap("need_overdue_amount")]
        [Validation(Required=true)]
        public long? NeedOverdueAmount { get; set; }

        // 当前应还总额（包含逾期和当前期）
        [NameInMap("current_need_amount")]
        [Validation(Required=true)]
        public long? CurrentNeedAmount { get; set; }

        // 总剩余应还
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

    }

}
