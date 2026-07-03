// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CallbackMdipAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审批结果
        [NameInMap("audit_result")]
        [Validation(Required=true)]
        public string AuditResult { get; set; }

        // 工单流水号
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 额外信息
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

    }

}
