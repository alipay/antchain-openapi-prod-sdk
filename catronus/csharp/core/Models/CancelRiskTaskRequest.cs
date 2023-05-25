// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class CancelRiskTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险工单ID
        [NameInMap("risk_task_id")]
        [Validation(Required=true)]
        public string RiskTaskId { get; set; }

        // 评论，理由
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

    }

}
