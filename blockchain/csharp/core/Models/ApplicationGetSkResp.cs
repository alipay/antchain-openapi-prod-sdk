// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 查看应用秘钥响应信息
    public class ApplicationGetSkResp : TeaModel {
        // 应用秘钥
        [NameInMap("sk")]
        [Validation(Required=false)]
        public string Sk { get; set; }

    }

}
