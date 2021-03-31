// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 电子回单查询，具体凭证数据
    public class ScpTicketIssueData : TeaModel {
        // 凭证对应的司机/货主的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 	
        // 凭证id
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

    }

}
