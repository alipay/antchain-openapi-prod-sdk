// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ORG.Models
{
    // 机构趋势数据
    public class OrgTrendData : TeaModel {
        // 日期
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 还款金额
        [NameInMap("repayment_amt")]
        [Validation(Required=true)]
        public string RepaymentAmt { get; set; }

        // 预算金额
        [NameInMap("budget_amt")]
        [Validation(Required=true)]
        public string BudgetAmt { get; set; }

        // 交易金额
        [NameInMap("trade_amt")]
        [Validation(Required=true)]
        public string TradeAmt { get; set; }

    }

}
