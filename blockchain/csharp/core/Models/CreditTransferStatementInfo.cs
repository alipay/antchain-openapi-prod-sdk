// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 物流金融信用流转流水信息
    public class CreditTransferStatementInfo : TeaModel {
        // 信用凭证额度
        [NameInMap("credit_limit")]
        [Validation(Required=false)]
        public string CreditLimit { get; set; }

        // 信用凭证到期时间
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

        // 凭证来源方did
        [NameInMap("from_did")]
        [Validation(Required=false)]
        public string FromDid { get; set; }

        // 信用凭证发起时间
        [NameInMap("issue_date")]
        [Validation(Required=false)]
        public string IssueDate { get; set; }

        // 信用流转凭证
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 流水类型
        [NameInMap("state_type")]
        [Validation(Required=false)]
        public string StateType { get; set; }

        // 凭证流转方did
        [NameInMap("to_did")]
        [Validation(Required=false)]
        public string ToDid { get; set; }

    }

}
