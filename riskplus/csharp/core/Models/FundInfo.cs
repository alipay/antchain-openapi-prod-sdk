// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 机构侧最高可用额度
    public class FundInfo : TeaModel {
        // 资金方编号
        [NameInMap("fund_code")]
        [Validation(Required=true)]
        public string FundCode { get; set; }

        // 资金方简称
        [NameInMap("abbre_fund_name")]
        [Validation(Required=true)]
        public string AbbreFundName { get; set; }

        // 额度状态
        [NameInMap("credit_status")]
        [Validation(Required=true)]
        public string CreditStatus { get; set; }

        // 授信总额度
        [NameInMap("credit_amount")]
        [Validation(Required=false)]
        public string CreditAmount { get; set; }

        // 剩余可用余额
        [NameInMap("rest_amount")]
        [Validation(Required=false)]
        public string RestAmount { get; set; }

        // 年利率
        [NameInMap("year_interest_rate")]
        [Validation(Required=false)]
        public string YearInterestRate { get; set; }

    }

}
