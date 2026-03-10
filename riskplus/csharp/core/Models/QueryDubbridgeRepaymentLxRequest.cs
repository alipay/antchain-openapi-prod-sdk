// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRepaymentLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 还款请求流水号/账单号
        [NameInMap("bill_id")]
        [Validation(Required=true)]
        public string BillId { get; set; }

        // 放款编号/借据号
        [NameInMap("capital_loan_no")]
        [Validation(Required=true)]
        public string CapitalLoanNo { get; set; }

    }

}
