// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class SendSecurityDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 安全累计属性列表字段，安全属性列表
        [NameInMap("security_content")]
        [Validation(Required=true)]
        public string SecurityContent { get; set; }

        // 代码发送给安全核心的事件编码
        [NameInMap("security_sign")]
        [Validation(Required=true)]
        public string SecuritySign { get; set; }

    }

}
