// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class SubmitDigregReviewRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数登ID
        [NameInMap("dig_reg_id")]
        [Validation(Required=true)]
        public string DigRegId { get; set; }

        // 复审结果：
        // REPLACE_DCI（复审不通过，补正需要替换DCI作品）
        // NO_NEED_REPLACE_DCI（复审不通过，补正不需要替换DCI作品）
        // PASS（复审通过）
        [NameInMap("audit_result")]
        [Validation(Required=true)]
        public string AuditResult { get; set; }

        // 复审不通过原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
