// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 审核信息
    public class AuditInfo : TeaModel {
        // 审核步骤
        [NameInMap("stage")]
        [Validation(Required=true)]
        public string Stage { get; set; }

        // 审核主体
        [NameInMap("audit_subject")]
        [Validation(Required=true)]
        public string AuditSubject { get; set; }

        // 审核状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 审核时间
        [NameInMap("apply_date_str")]
        [Validation(Required=true)]
        public string ApplyDateStr { get; set; }

        // 审核失败描述
        [NameInMap("fail_reason")]
        [Validation(Required=true)]
        public string FailReason { get; set; }

    }

}
