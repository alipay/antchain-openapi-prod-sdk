// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ConfirmSecurityPolicyRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 二次确认参数，防止篡改
        [NameInMap("confirm_params")]
        [Validation(Required=true)]
        public string ConfirmParams { get; set; }

        // 代码发送给安全核心的事件编码
        [NameInMap("security_id")]
        [Validation(Required=true)]
        public string SecurityId { get; set; }

    }

}
