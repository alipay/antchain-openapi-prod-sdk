// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CreateRbbApiGwtokenRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 扩展字段
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 新人用户密码，用来做映射生成token
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

        // 用户
        [NameInMap("username")]
        [Validation(Required=true)]
        public string Username { get; set; }

    }

}
