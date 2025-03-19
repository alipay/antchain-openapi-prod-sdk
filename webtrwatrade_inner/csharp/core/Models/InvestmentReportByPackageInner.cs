// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE_INNER.Models
{
    // 内部投资者报表数据(资产包维度)
    public class InvestmentReportByPackageInner : TeaModel {
        // 预期收益
        [NameInMap("estimated_annualized")]
        [Validation(Required=true)]
        public MultiCurrencyMoney EstimatedAnnualized { get; set; }

        // 实际收益率(Annual Yield)
        [NameInMap("actual_annualized_yield")]
        [Validation(Required=true)]
        public string ActualAnnualizedYield { get; set; }

        // 预期收益率（Expect Yield）
        [NameInMap("estimated_annualized_yield")]
        [Validation(Required=true)]
        public string EstimatedAnnualizedYield { get; set; }

        // 毛利吻合率（Gross Profit Conformity）
        [NameInMap("match_rate")]
        [Validation(Required=true)]
        public string MatchRate { get; set; }

        // 投资金额（Investment Allocation）
        [NameInMap("investment_amount")]
        [Validation(Required=true)]
        public MultiCurrencyMoney InvestmentAmount { get; set; }

        // 实际收益
        [NameInMap("actual_annualized")]
        [Validation(Required=true)]
        public MultiCurrencyMoney ActualAnnualized { get; set; }

        // 资产抵押率（Collateral Ratio）
        [NameInMap("collateral_rate")]
        [Validation(Required=true)]
        public string CollateralRate { get; set; }

        // 数据日期
        [NameInMap("dt")]
        [Validation(Required=true)]
        public string Dt { get; set; }

        // 现金流覆盖季度还款金额比例
        [NameInMap("cash_flow_coverage_quarterly_repayment_amount_ratio")]
        [Validation(Required=true)]
        public string CashFlowCoverageQuarterlyRepaymentAmountRatio { get; set; }

        // 现金流
        [NameInMap("cash_flow")]
        [Validation(Required=true)]
        public MultiCurrencyMoney CashFlow { get; set; }

        // 抵押物总值
        [NameInMap("collateral_total_value")]
        [Validation(Required=true)]
        public MultiCurrencyMoney CollateralTotalValue { get; set; }

    }

}
