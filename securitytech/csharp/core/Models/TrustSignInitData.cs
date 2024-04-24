// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 可信签约录入准备数据
    public class TrustSignInitData : TeaModel {
        // 请求唯一标识Id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 签约秘钥
        [NameInMap("sign_key")]
        [Validation(Required=true)]
        public string SignKey { get; set; }

    }

}
