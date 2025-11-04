// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class SubmitDigregPreliminaryreviewRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数登初审
        [NameInMap("dig_reg_id")]
        [Validation(Required=true)]
        public string DigRegId { get; set; }

        // 审核状态
        [NameInMap("audit_status")]
        [Validation(Required=true)]
        public string AuditStatus { get; set; }

        // 审核结果
        [NameInMap("audit_result")]
        [Validation(Required=true)]
        public bool? AuditResult { get; set; }

    }

}
