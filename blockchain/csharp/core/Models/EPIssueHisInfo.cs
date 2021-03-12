// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 版通历史发行记录信息
    public class EPIssueHisInfo : TeaModel {
        // 版通发行日期时间戳
        [NameInMap("issue_date")]
        [Validation(Required=true)]
        public long? IssueDate { get; set; }

        // 版通线下发行量
        [NameInMap("offline_issue_amount")]
        [Validation(Required=true)]
        public long? OfflineIssueAmount { get; set; }

        // 版通线上发行量
        [NameInMap("online_issue_amount")]
        [Validation(Required=true)]
        public long? OnlineIssueAmount { get; set; }

        // 版通自持发行量
        [NameInMap("self_issue_amount")]
        [Validation(Required=true)]
        public long? SelfIssueAmount { get; set; }

    }

}
