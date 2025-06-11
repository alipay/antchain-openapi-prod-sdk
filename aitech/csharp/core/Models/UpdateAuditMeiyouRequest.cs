// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UpdateAuditMeiyouRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审核记录ID
        [NameInMap("audit_id")]
        [Validation(Required=true)]
        public long? AuditId { get; set; }

        // 审核结果
        [NameInMap("audit_result")]
        [Validation(Required=false)]
        public string AuditResult { get; set; }

        // 审核原因
        [NameInMap("audit_reason")]
        [Validation(Required=false)]
        public string AuditReason { get; set; }

        // 操作人
        [NameInMap("audit_operator")]
        [Validation(Required=false)]
        public string AuditOperator { get; set; }

        // 操作时间戳(毫秒)
        [NameInMap("audit_time")]
        [Validation(Required=false)]
        public long? AuditTime { get; set; }

    }

}
