// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢-电商-支用查询
    public class EcLoanQuery : TeaModel {
        // 总条数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public string TotalCount { get; set; }

        // 订单数组
        [NameInMap("loan_appls")]
        [Validation(Required=true)]
        public List<EcLoanAppls> LoanAppls { get; set; }

    }

}
