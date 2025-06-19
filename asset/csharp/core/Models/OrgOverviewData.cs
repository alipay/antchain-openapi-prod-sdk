// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ASSET.Models
{
    // 机构总览数据
    public class OrgOverviewData : TeaModel {
        // 预算总金额
        [NameInMap("total_budget_amt")]
        [Validation(Required=true)]
        public string TotalBudgetAmt { get; set; }

        // 花呗预算金额
        [NameInMap("huabei_budget_amt")]
        [Validation(Required=true)]
        public string HuabeiBudgetAmt { get; set; }

        // 借呗预算金额
        [NameInMap("jiebei_budget_amt")]
        [Validation(Required=true)]
        public string JiebeiBudgetAmt { get; set; }

        // 小微预算金额
        [NameInMap("xiaowei_budget_amt")]
        [Validation(Required=true)]
        public string XiaoweiBudgetAmt { get; set; }

        // 服务费预算金额
        [NameInMap("service_budget_amt")]
        [Validation(Required=true)]
        public string ServiceBudgetAmt { get; set; }

        // 总回款金额
        [NameInMap("total_repayment_amt")]
        [Validation(Required=true)]
        public string TotalRepaymentAmt { get; set; }

        // 花呗回款金额
        [NameInMap("huabei_repayment_amt")]
        [Validation(Required=true)]
        public string HuabeiRepaymentAmt { get; set; }

        // 借呗回款金额
        [NameInMap("jiebei_repayment_amt")]
        [Validation(Required=true)]
        public string JiebeiRepaymentAmt { get; set; }

        // 小微回款金额
        [NameInMap("xiaowei_repayment_amt")]
        [Validation(Required=true)]
        public string XiaoweiRepaymentAmt { get; set; }

        // 总交易金额
        [NameInMap("total_trade_amt")]
        [Validation(Required=true)]
        public string TotalTradeAmt { get; set; }

        // 花呗交易金额
        [NameInMap("huabei_trade_amt")]
        [Validation(Required=true)]
        public string HuabeiTradeAmt { get; set; }

        // 借呗交易金额
        [NameInMap("jiebei_trade_amt")]
        [Validation(Required=true)]
        public string JiebeiTradeAmt { get; set; }

        // 小微交易金额
        [NameInMap("xiaowei_trade_amt")]
        [Validation(Required=true)]
        public string XiaoweiTradeAmt { get; set; }

        // 内部补贴金额
        [NameInMap("internal_subsidy_amt")]
        [Validation(Required=true)]
        public string InternalSubsidyAmt { get; set; }

        // 净回款额
        [NameInMap("total_net_repayment_amt")]
        [Validation(Required=true)]
        public string TotalNetRepaymentAmt { get; set; }

        // 活动roi
        [NameInMap("activity_roi")]
        [Validation(Required=true)]
        public string ActivityRoi { get; set; }

    }

}
