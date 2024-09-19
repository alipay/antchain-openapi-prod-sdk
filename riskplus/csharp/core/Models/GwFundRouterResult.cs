// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 资金方信息
    public class GwFundRouterResult : TeaModel {
        // 资金方代码
        [NameInMap("fund_code")]
        [Validation(Required=true)]
        public string FundCode { get; set; }

        // 资金方简称
        [NameInMap("abbre_fund_name")]
        [Validation(Required=true)]
        public string AbbreFundName { get; set; }

    }

}
