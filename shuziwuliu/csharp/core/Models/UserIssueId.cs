// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 用户凭证信息
    public class UserIssueId : TeaModel {
        // 凭证id
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 凭证余额
        [NameInMap("balance_amt")]
        [Validation(Required=true)]
        public string BalanceAmt { get; set; }

    }

}
