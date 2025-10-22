// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 登录类型
    public class LoginAccountTypeBO : TeaModel {
        // 登录类型：EMAIL-邮箱
        [NameInMap("user_login_type")]
        [Validation(Required=false)]
        public string UserLoginType { get; set; }

        // 登录名称
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

    }

}
