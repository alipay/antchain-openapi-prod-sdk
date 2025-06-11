// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryMeiyouAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审核记录ID
        [NameInMap("audit_ids")]
        [Validation(Required=true)]
        public List<long?> AuditIds { get; set; }

        // 美柚itag关联状态
        [NameInMap("audit_state")]
        [Validation(Required=true)]
        public string AuditState { get; set; }

    }

}
