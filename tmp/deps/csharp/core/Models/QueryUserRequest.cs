// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryUserRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 没传递该参数时，返回当前登录用户信息
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

    }

}
