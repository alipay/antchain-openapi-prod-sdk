// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 小程序浏览器授权类型
    public class MiniAppBrowserAuthType : TeaModel {
        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

    }

}
