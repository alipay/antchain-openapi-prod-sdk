// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class GetSessionAccessorRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 登录态
        [NameInMap("authorization")]
        [Validation(Required=true)]
        public string Authorization { get; set; }

        // 用户所属租户
        [NameInMap("user_tenant")]
        [Validation(Required=true)]
        public string UserTenant { get; set; }

    }

}
