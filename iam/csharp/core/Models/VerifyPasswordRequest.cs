// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class VerifyPasswordRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 加密过的密码值，使用AccessSecret进行3DES加密
        [NameInMap("encrypted_password")]
        [Validation(Required=true)]
        public string EncryptedPassword { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

    }

}
