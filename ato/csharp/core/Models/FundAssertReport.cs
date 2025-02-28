// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 资产报告详情
    public class FundAssertReport : TeaModel {
        // 投放月份 (整月)
        [NameInMap("delivery_month")]
        [Validation(Required=true)]
        public string DeliveryMonth { get; set; }

        // 账单金额
        [NameInMap("total_bill_amount")]
        [Validation(Required=true)]
        public long? TotalBillAmount { get; set; }

        // 平均期限
        [NameInMap("average_term")]
        [Validation(Required=true)]
        public string AverageTerm { get; set; }

        // 状态为取消的账单金额
        [NameInMap("cancelled_bill_amount")]
        [Validation(Required=true)]
        public long? CancelledBillAmount { get; set; }

        // 状态为逾期1天及以上的账单金额
        [NameInMap("bill_amount_overdue_by_1day_or_more")]
        [Validation(Required=true)]
        public long? BillAmountOverdueBy1dayOrMore { get; set; }

        // 状态为逾期30天及以上的账单金额
        [NameInMap("bill_amount_overdue_by_30_days_or_more")]
        [Validation(Required=true)]
        public long? BillAmountOverdueBy30DaysOrMore { get; set; }

        // Y期的订单的账单金额
        [NameInMap("total_bill_amount_y_period")]
        [Validation(Required=true)]
        public long? TotalBillAmountYPeriod { get; set; }

        // 已到Y期订单中Y期平均期限(y期订单的平均期限)
        [NameInMap("average_term_y_period")]
        [Validation(Required=true)]
        public string AverageTermYPeriod { get; set; }

        // Y期的订单中状态为取消的账单金额
        [NameInMap("cancelled_bill_amount_y_period")]
        [Validation(Required=true)]
        public long? CancelledBillAmountYPeriod { get; set; }

        // Y期的订单中状态为逾期1天及以上的账单金额
        [NameInMap("bill_amount_overdue_by_1day_or_more_y_period")]
        [Validation(Required=true)]
        public long? BillAmountOverdueBy1dayOrMoreYPeriod { get; set; }

        // Y期的订单中状态为逾期30天及以上的账单金额
        [NameInMap("bill_amount_overdue_by_30_days_or_more_y_period")]
        [Validation(Required=true)]
        public long? BillAmountOverdueBy30DaysOrMoreYPeriod { get; set; }

    }

}
