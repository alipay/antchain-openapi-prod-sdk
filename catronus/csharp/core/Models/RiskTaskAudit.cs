// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 风险操作审计
    public class RiskTaskAudit : TeaModel {
        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 操作类型
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

        // 风险工单ID
        [NameInMap("risk_task_id")]
        [Validation(Required=true)]
        public string RiskTaskId { get; set; }

        // 评论
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

    }

}
