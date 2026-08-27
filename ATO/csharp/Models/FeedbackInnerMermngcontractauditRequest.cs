// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class FeedbackInnerMermngcontractauditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 审核id
        [NameInMap("audit_id")]
        [Validation(Required=true)]
        public string AuditId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 修订ID
        [NameInMap("revision_id")]
        [Validation(Required=true)]
        public string RevisionId { get; set; }

        // 反馈内容
        [NameInMap("feedback_content")]
        [Validation(Required=true)]
        public string FeedbackContent { get; set; }

        // buid
        [NameInMap("bu_id")]
        [Validation(Required=true)]
        public string BuId { get; set; }

    }

}
