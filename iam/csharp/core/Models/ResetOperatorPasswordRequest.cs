// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class ResetOperatorPasswordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 登录名
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

        // 加密过的新密码值，使用AccessSecret进行3DES加密
        [NameInMap("new_encrypted_password")]
        [Validation(Required=true)]
        public string NewEncryptedPassword { get; set; }

        // 登录凭证状态，取值范围：NORMAL, EXPIRED
        // 
        // 默认为 NORMAL，设为 EXPIRED 用户登录时会要求重置密码
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
