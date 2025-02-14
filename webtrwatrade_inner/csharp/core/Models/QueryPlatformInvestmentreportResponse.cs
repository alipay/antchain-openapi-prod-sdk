// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE_INNER.Models
{
    public class QueryPlatformInvestmentreportResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 预期收益
        [NameInMap("estimated_annualized")]
        [Validation(Required=false)]
        public long? EstimatedAnnualized { get; set; }

        // 实际收益率（Annual Yield）
        [NameInMap("actual_annualized_yield")]
        [Validation(Required=false)]
        public long? ActualAnnualizedYield { get; set; }

        // 预期收益率（Expect Yield）
        [NameInMap("estimated_annualized_yield")]
        [Validation(Required=false)]
        public long? EstimatedAnnualizedYield { get; set; }

        // 毛利吻合率（Gross Profit Conformity）
        [NameInMap("match_rate")]
        [Validation(Required=false)]
        public long? MatchRate { get; set; }

        // 投资金额（Investment Allocation）
        [NameInMap("investment_amount")]
        [Validation(Required=false)]
        public long? InvestmentAmount { get; set; }

        // 实际收益
        [NameInMap("actual_annualized")]
        [Validation(Required=false)]
        public long? ActualAnnualized { get; set; }

        // 资产抵押率（Collateral Ratio）
        [NameInMap("collateral_rate")]
        [Validation(Required=false)]
        public long? CollateralRate { get; set; }

        // 数据日期
        [NameInMap("dt")]
        [Validation(Required=false)]
        public string Dt { get; set; }

    }

}
