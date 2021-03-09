// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class CheckLoginnameRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 邮箱名称
        [NameInMap("login_name")]
        [Validation(Required=true)]
        public string LoginName { get; set; }

    }

}
