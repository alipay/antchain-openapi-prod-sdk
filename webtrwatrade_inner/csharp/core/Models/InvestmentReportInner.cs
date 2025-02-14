// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE_INNER.Models
{
    //   内部投资者报表数据
    public class InvestmentReportInner : TeaModel {
        // 预期收益
        // 
        [NameInMap("estimated_annualized")]
        [Validation(Required=true)]
        public long? EstimatedAnnualized { get; set; }

        // 实际收益率（Annual Yield）
        // 
        [NameInMap("actual_annualized_yield")]
        [Validation(Required=true)]
        public long? ActualAnnualizedYield { get; set; }

        // 预期收益率（Expect Yield）
        [NameInMap("estimated_annualized_yield")]
        [Validation(Required=true)]
        public long? EstimatedAnnualizedYield { get; set; }

        // 毛利吻合率（Gross Profit Conformity）
        [NameInMap("match_rate")]
        [Validation(Required=true)]
        public long? MatchRate { get; set; }

        // 投资金额（Investment Allocation）
        [NameInMap("investment_amount")]
        [Validation(Required=true)]
        public long? InvestmentAmount { get; set; }

        // 实际收益
        [NameInMap("actual_annualized")]
        [Validation(Required=true)]
        public long? ActualAnnualized { get; set; }

        // 资产抵押率（Collateral Ratio）
        [NameInMap("collateral_rate")]
        [Validation(Required=true)]
        public long? CollateralRate { get; set; }

        // 数据日期
        [NameInMap("dt")]
        [Validation(Required=true)]
        public string Dt { get; set; }

    }

}
