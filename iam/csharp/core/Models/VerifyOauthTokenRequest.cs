// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class VerifyOauthTokenRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // token值
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 是否刷新access_token有限期
        [NameInMap("extend")]
        [Validation(Required=false)]
        public bool? Extend { get; set; }

        // token应用场景，LOGIN或AUTH
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

    }

}
