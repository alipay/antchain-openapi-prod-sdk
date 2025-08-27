// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 资方后台融资结果
    public class FundMngLoanApplyResult : TeaModel {
        // 放款状态
        [NameInMap("loan_apply_status")]
        [Validation(Required=false)]
        public string LoanApplyStatus { get; set; }

        // 融资申请失败原因
        [NameInMap("loan_fail_reason")]
        [Validation(Required=false)]
        public string LoanFailReason { get; set; }

    }

}
