// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 逾期信息查询响应
    public class OverdueInfoResponse : TeaModel {
        // 逾期标识
        // true：逾期
        // false：未逾期
        [NameInMap("over_due_flag")]
        [Validation(Required=true)]
        public bool? OverDueFlag { get; set; }

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

        // 当前应还总额
        [NameInMap("current_need_amount")]
        [Validation(Required=true)]
        public long? CurrentNeedAmount { get; set; }

        // 总剩余应还
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 数据日期
        [NameInMap("settle_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SettleDate { get; set; }

        // 借款唯一编号
        [NameInMap("receipt_no")]
        [Validation(Required=true)]
        public string ReceiptNo { get; set; }

        // 已还期数
        [NameInMap("already_repay_period_count")]
        [Validation(Required=true)]
        public long? AlreadyRepayPeriodCount { get; set; }

        // 贷款期数
        [NameInMap("loan_period_count")]
        [Validation(Required=true)]
        public long? LoanPeriodCount { get; set; }

        // 未还本金
        [NameInMap("outstanding_principal")]
        [Validation(Required=true)]
        public long? OutstandingPrincipal { get; set; }

        // 放款日期
        [NameInMap("loan_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LoanTime { get; set; }

        // 结清标志
        [NameInMap("settle_flag")]
        [Validation(Required=true)]
        public bool? SettleFlag { get; set; }

        // 最近一次还款日期
        [NameInMap("nearest_repay_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string NearestRepayTime { get; set; }

    }

}
